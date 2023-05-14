package com.api.automation.PropertyUtils;

import com.api.automation.Constants.FrameworkContants;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public final class PropertyUtils {

    private PropertyUtils(){}

    private static Map<String,String> ConfigValues = new HashMap<String,String>();

    private static Properties prop =  new Properties();


    static{
        try(FileInputStream fis =  new FileInputStream(FrameworkContants.getInstance().getGetConfigPropertyFilePath())){
            prop.load(fis);
            prop.entrySet().forEach(e-> ConfigValues.put(String.valueOf(e.getKey()),String.valueOf(e.getValue())));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getPropValue(String Key){
        return ConfigValues.get(Key.toLowerCase());
    }
}
