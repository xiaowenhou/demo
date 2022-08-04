package com.xiaowenhou.autowired.testConflict;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TargetClassB {

//    @Autowired
//    InterfaceClass a;

      //b也可以正常注入
//    @Autowired
//    InterfaceClass b;

      //c会报错, 抛NoUniqueBeanDefinitionException:异常, 因为相同类型找到了两个bean(a, b),通过c, 找不到bean, 因此不知道选择哪一个
    @Autowired
    InterfaceClass c;


    public InterfaceClass getA() {
        return c;
    }
}
