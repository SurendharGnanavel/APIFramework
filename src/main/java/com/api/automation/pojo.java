package com.api.automation;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter@Setter
@Builder(setterPrefix = "set")
@ToString
public class pojo {

    private String name;
    private String job;

}
