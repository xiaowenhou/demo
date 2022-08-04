package com.xiaowenhou.resource;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class TargetClass {

    @Resource
    private ClassA fieldA;


    //没加name属性, 先将interfaceA作为bean name去找, 发现找不到
    //接着按照InterfaceA类型去找, 找到两个bean, a和b, 报错. 解决也很简单, 将ClassA或者ClassB其中一个的bean name改成interfaceA即可.
    @Resource
    private InterfaceA interfaceA;

    public ClassA getClassA() {
        return fieldA;
    }
}
