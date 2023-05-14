package com.api.automation.Constants;

import lombok.Getter;

@Getter
public class FrameworkContants {

    private static FrameworkContants frameworkContants =null;

    private FrameworkContants(){}


    public static FrameworkContants getInstance(){
        if(frameworkContants==null){
            frameworkContants =  new FrameworkContants();
        }
        return frameworkContants;
    }

    private final String getConfigPropertyFilePath = System.getProperty("user.dir")+"\\src\\main\\resources\\config.properties";

    private final String getSchemaFilePath = System.getProperty("user.dir")+"\\src\\test\\resources\\schema\\Schema.json";


}
