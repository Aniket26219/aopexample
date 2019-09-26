package com.aopexample.aopexample.controller;

import com.aopexample.aopexample.impl.MyImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    MyImpl myImpl;

    @GetMapping(value = "/show")
    public String showData(){
        return myImpl.getData();
    }
}
