package com.driver;

public class RWOnly {
    // private access modifier
    private String name;
    // setter function for security
    public void setter(String name)
    {
        this.name=name;
    }
    // getter function for readOnly
    public String getter()
    {
        return this.name;
    }
    
}
