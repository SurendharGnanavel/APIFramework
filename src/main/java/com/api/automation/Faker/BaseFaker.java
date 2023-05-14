package com.api.automation.Faker;

import com.api.automation.Faker.FakeUtils;

public class BaseFaker {


    public String getFirstname(){
       return new FakeUtils().getName();
    }

    public String getjobDetails(){
        return new FakeUtils().getJob();
    }
}
