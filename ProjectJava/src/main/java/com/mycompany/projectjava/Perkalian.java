/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectjava;
/**
 *
 * @author asus
 */
 class kali {
     double a;
     double b;
     
     void hasil()
     {
         System.out.println("Hasil kali: " + (a*b));
     }
    
}
public class Perkalian
{
    public static void main(String[] args){
        kali variabel1, variabel2;
        variabel1 = new kali();
        variabel2 = new kali();
        
        variabel1.a = 3;
        variabel1.b = 6;
        
        variabel2.a = 5;
        variabel2.b = 10;
        
        variabel1.hasil();
        variabel2.hasil();
    }
    }
