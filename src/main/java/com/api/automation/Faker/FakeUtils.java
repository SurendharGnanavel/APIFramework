package com.api.automation.Faker;

import com.github.javafaker.Faker;

public class FakeUtils {

    public String getName(){
        return new Faker().name().fullName().toString();
    }

    public String getJob(){
        return new Faker().job().field().toString();
    }
}
