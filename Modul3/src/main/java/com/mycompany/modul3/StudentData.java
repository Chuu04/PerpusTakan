/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul3;

/**
 *
 * @author asus
 */
class StudentData {
    private int stuID;
    private String stuName;
    private int stuAge;
    
    StudentData()
    {
        stuID = 100;
        stuName = "New student";
        stuAge = 18;
    }
    StudentData(int num1, String str, int num2)
    {
        stuID = num1;
        stuName = str;
        stuAge = num2;
    }
    public int getstuID()
    {
        return stuID;
    }
    public void setstuName(String stuName)
    {
        this.stuName = stuName;
    } 
    public String getstuName()
    {
        return stuName;
    }
    public void setstuID(int stuID)
    {
        this.stuID = stuID;
    }
     public int getstuAge()
    {
        return stuAge;
    }
    public void setstuAge(int stuAge)
    {
        this.stuAge = stuAge;
    }
    
    public static void Main(String args[])
            {
                StudentData data1 = new StudentData();
                System.out.println("student name is:"+data1.getstuName());
                System.out.println("student age is:"+data1.getstuAge());
                System.out.println("student ID is:"+data1.getstuID());
                
                StudentData data2 = new StudentData(123, "Alex", 18);
                System.out.println("student name is:"+data2.getstuName());
                System.out.println("student age is:"+data2.getstuAge());
                System.out.println("student ID is:"+data2.getstuID());
            }
}
