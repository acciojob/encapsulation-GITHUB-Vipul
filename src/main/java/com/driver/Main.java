package com.driver;

public class Main {
    public static void main(String[] args)
    {
        RWOnly r=new RWOnly();
        // name variable has private access modifier so direct access not possible

        //setting value through setter function in RWOnly
        r.setter("aakash");
        // printing value through getter function in RWOnly
        System.out.println(r.getter());
    }
  
}