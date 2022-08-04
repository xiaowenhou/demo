package com.xiaowenhou.autowired.normal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TargetClass {

    @Autowired
    private ClassA fieldA;


    public ClassA getClassA() {
        return fieldA;
    }
}
