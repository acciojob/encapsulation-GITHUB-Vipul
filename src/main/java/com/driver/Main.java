package com.driver;

public class Main {
    public static void main(String[] args)
    {
       //object creation
        RWOnly obj=new RWOnly();

         // name variable has private access modifier so direct access not possible
        // System.out.println(r.name);
        //setting value through setter function in RWOnly
        obj.setName("aakash");
        // printing value through getter function in RWOnly
        System.out.println(obj.getName());
    }
  
}