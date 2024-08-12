package com.basic;

import java.util.SplittableRandom;

public class Employee {
    private int id;
    private String fname;
    private String lName;
    private String address;
    private float salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getFname()
    {
        return fname;
    }
    public void setFname(String fname)
    {
        this.fname=fname;
    }
    public String getlName()
    {
        return lName;
    }
    public void setlName(String lName)
    {
        this.lName=lName;
    }
    public String getAddress()
    {
        return address;
    }
    public void setAddress(String address)
    {
        this.address=address;
    }
    public float getSalary()
    {
        return salary;
    }
    public void setSalary(float salary)
    {
        this.salary=salary;
    }
}
