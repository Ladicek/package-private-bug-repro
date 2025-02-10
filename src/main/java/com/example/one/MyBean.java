package com.example.one;

import jakarta.enterprise.context.Dependent;

@Dependent
public class MyBean {
    public String hello() {
        return "hello";
    }
}
