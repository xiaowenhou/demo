package com.xiaowenhou.resource;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMainClass {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.xiaowenhou.resource");
        context.refresh();
        //singletonObjects.get("f")
        ClassA classA =context.getBean(TargetClass.class).getClassA();
        System.out.printf("classA = " + classA);
    }
}
