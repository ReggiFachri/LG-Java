package com.lgcns.chapter09;

public class OverridingParentHelpEx {

    public void methodA() {
        System.out.println("A method");
    }
    public int methodB( int number ) {
        int tempNumber = 20;
        int result = 10;
        result = number + tempNumber;
        return result;
    }
    protected void methodC() {
        System.out.println("C method");
    }
}

