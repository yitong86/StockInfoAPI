package com.careerdevs.stockInfoAPI.stockControllers;


import com.careerdevs.stockInfoAPI.models.ApiModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
//@RequestMapping("/stock")
public class StockController {
    @Autowired
    private Environment env;
    //filed
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/test")
    private  String test(){
        return "Hi";
    }


    @GetMapping("/info")
    private ApiModel stockToday(@RequestParam String symbol) {
        //get the key
        String apiKey = env.getProperty("API_KEY", "GBH1E3EPFEC9QMQ3");
        //built the URL
        //https://www.alphavantage.co/query?function=OVERVIEW&symbol=IBM&apikey=8HAB6GX9QQ3M9HVS
        String URL = "https://www.alphavantage.co/query?function=OVERVIEW&symbol=" + symbol+"&apikey=" + apiKey;

        //make the request
       // ApiModel test = new ApiModel();
        ApiModel response = restTemplate.getForObject(URL, ApiModel.class);
        //return the data
        //System.out.println(URL);
        System.out.println("Symbol " + response.getSymbol());
        return response;
    }
}