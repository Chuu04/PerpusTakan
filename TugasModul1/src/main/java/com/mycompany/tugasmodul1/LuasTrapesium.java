/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugasmodul1;

class Trapesium {
    double a;
    double b;
    double t;

    void setNilai(double sisiA, double sisiB, double tinggi){
        a = sisiA;
        b = sisiB;
        t = tinggi;
    }

    double hitungLuas(){
        return 0.5 * (a + b) * t;
    }
}

public class LuasTrapesium {
    public static void main(String[] args){
        Trapesium tp = new Trapesium();

        tp.setNilai(26,28,15);

        System.out.println("Luas Trapesium = " + tp.hitungLuas());
    }
}