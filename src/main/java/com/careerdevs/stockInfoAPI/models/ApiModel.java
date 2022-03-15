package com.careerdevs.stockInfoAPI.models;

public class ApiModel {
    private String Symbol;
    private String AssetType;
    private String Name;

    @Override
    public String toString() {
        return "ApiModel{" +
                "Symbol='" + Symbol + '\'' +
                ", AssetType='" + AssetType + '\'' +
                ", Name='" + Name + '\'' +
                '}';
    }


    public String getSymbol() {
        return Symbol;
    }

    public String getAssetType() {
        return AssetType;
    }

    public String getName() {
        return Name;
    }
    public ApiModel(){

    }
}
