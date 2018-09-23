package com.sda.exercises.classes.inheritance.examples.methods;

public class ChildClass extends ParentClass {
    //hides static method from ParentClass
    public static void methodA() {}

    @Override
    public void methodB() {}
}
