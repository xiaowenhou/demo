package com.xiaowenhou.autowired.testConflict;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMainClass {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.xiaowenhou.autowired.testConflict");
        context.refresh();
        //singletonObjects.get("f")
        InterfaceClass classA =context.getBean(TargetClassB.class).getA();
        System.out.printf("classA = " + classA);
    }
}
