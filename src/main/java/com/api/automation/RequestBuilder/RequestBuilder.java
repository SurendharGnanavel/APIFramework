package com.api.automation.RequestBuilder;

import com.api.automation.Enum.Enums;
import com.api.automation.PropertyUtils.PropertyUtils;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

public class RequestBuilder {


    public static RequestSpecification RequestBuilderforGetCalls(){
        return given()
                .baseUri(PropertyUtils.getPropValue(String.valueOf(Enums.BASEURL)))
                .log()
                .all();
    }


    public static RequestSpecification RequestBuilderforPostCalls(){
        return given()
                .baseUri(PropertyUtils.getPropValue(String.valueOf(Enums.BASEURL)))
                .contentType(ContentType.JSON)
                .log()
                .all();
    }



}
