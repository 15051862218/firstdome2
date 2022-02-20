package com.company.test;

import com.company.Junit.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Calculatortest {
    @Before
    public void init(){
        System.out.println("init.....");
    }
    @After
    public void close(){
        System.out.println("close.....");
    }
    @Test
    public void testadd(){
        System.out.println("我被执行了");
        System.out.println("testadd.....");
        Calculator c=new Calculator();
        int result=c.add(3,5);
      //  int result2=c.sub(7,5);
        System.out.println(result);
      //  System.out.println(result2);
       Assert.assertEquals(8,result);
    }
    @Test
    public void testsub(){
        System.out.println("我被执行了");
        System.out.println("testsub.....");
        Calculator c=new Calculator();
        int result=c.sub(3,5);
        //  int result2=c.sub(7,5);
        System.out.println(result);
        //  System.out.println(result2);
        Assert.assertEquals(-2,result);
    }
}


