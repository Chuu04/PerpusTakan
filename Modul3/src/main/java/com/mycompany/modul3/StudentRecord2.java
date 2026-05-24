/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul3;

/**
 *
 * @author asus
 */
public class StudentRecord2 {
    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;
    
    private static int studentCount;
    
    
    public String getName()
    {
    return name;
    }
    public void setName( String temp )
    {
    name = temp;
    }
    public void setAddress(String temp)
    {
        address = temp;
    }
    public String getAddress()
    {
        return address;
    }
    public void setAge(int temp)
    {
        age = temp;
    }
    public void setenglishGrade(double temp)
    {
        englishGrade = temp;
    }
    public double getenglishGrade()
    {
        return englishGrade;
    }
    public void setmathGrade(double temp)
    {
        mathGrade = temp;
    }
    public double getmathGrade()
    {
        return mathGrade;
    }
    public void setscienceGrade(double temp)
    {
        scienceGrade = temp;
    }
    public double getscienceGrade()
    {
        return scienceGrade;
    }
    public double getAverage(){
    double result = 0;
    result = (mathGrade+englishGrade+scienceGrade)/3;
    
    return result;
    }
    
    public void print (String temp)
    {
        System.out.println("name:" + name);
        System.out.println("address:" + address);
        System.out.println("age:" + age);
    }
    public void print(double enlishGrade, double mathGrade, double scienceGrade)
    {
        System.out.println("name:" + name);
        System.out.println("matth:" + mathGrade);
        System.out.println("english:" + englishGrade);
        System.out.println("science:" + scienceGrade);
        
    }
}
