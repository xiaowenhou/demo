package com.xiaowenhou.resource;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class TargetClass {

    @Resource
    private ClassA fieldA;


    public ClassA getClassA() {
        return fieldA;
    }
}
