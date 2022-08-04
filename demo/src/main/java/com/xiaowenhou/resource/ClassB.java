package com.xiaowenhou.resource;

import org.springframework.stereotype.Component;

//@Component("interfaceA")  改成这样就不会报错
@Component("b")
public class ClassB implements InterfaceA{
}
