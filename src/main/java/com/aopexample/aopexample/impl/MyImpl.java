package com.aopexample.aopexample.impl;

import com.aopexample.aopexample.repo.MyInterface;
import org.springframework.stereotype.Service;

@Service
public class MyImpl implements MyInterface {
    @Override
    public String getData() {
        return "This is from impl";
    }
}
