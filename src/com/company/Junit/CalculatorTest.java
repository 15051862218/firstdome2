package com.company.Junit;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator c=new Calculator();
        int result=c.add(3,5);
        int result2=c.sub(7,5);
        System.out.println(result);
        System.out.println(result2);
    }
}
