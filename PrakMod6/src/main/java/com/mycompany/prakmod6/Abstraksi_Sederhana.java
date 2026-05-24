/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prakmod6;

/**
 *
 * @author asus
 */

abstract class P 
{
    abstract public void method2();
    int x,y,z;
    
    public void method1()
    {
        System.out.println("method nyata dari class P");
        System.out.println("nilai x,y ditentukan dalam class P");
        x = 12;
        y = 10;
    }
}
class Q extends P
{
    public void method2()
    {
        System.out.println("method abstract yang sudah menjadi nyata dikelas P");
        int Z = x + y;
        
        System.out.println("hasil perhitungan = "+z);
        System.out.println(" ");
    
    }
class Abstraksi_Sederhana
{
    public static void main(String [] args)
    {
        Q object = new Q();
        object.method1();
        object.method2();
    }
}
