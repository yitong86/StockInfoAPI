package com.careerdevs.stockInfoAPI.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ApiModel {
    @JsonProperty("Symbol") private String symbol;
    @JsonProperty("Name") private String assetType;
    @JsonProperty("Description") private String name;
    @JsonProperty("MarketCapitalization") private String marketCapitalization;
    @JsonProperty("Exchange") private String exchange;
    @JsonProperty("Currency") private String currency;

    public String getSymbol() {
        return symbol;
    }

    public String getAssetType() {
        return assetType;
    }

    public String getName() {
        return name;
    }

    public String getMarketCapitalization() {
        return marketCapitalization;
    }

    public String getExchange() {
        return exchange;
    }

    public String getCurrency() {
        return currency;
    }

    public ApiModel(){

    }
    @Override
    public String toString() {
        return "ApiModel{" +
                "symbol='" + symbol + '\'' +
                ", assetType='" + assetType + '\'' +
                ", name='" + name + '\'' +
                ", MarketCapitalization='" + marketCapitalization + '\'' +
                ", Exchange='" + exchange + '\'' +
                ", Currency='" + currency + '\'' +
                '}';
    }
}
