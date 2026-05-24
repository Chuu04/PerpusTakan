package com.mycompany.tugasmodul1;

class Tabung {
    double r;
    double t;

    void setNilai(double radius, double tinggi){
        r = radius;
        t = tinggi;
    }

    double hitungLuasIsi(){
        return 3.14 * r * r * t;
    }
}

public class LuasIsiTabung {
    public static void main(String[] args){

        Tabung tb = new Tabung();

        tb.setNilai(7.5,25);

        double luas = tb.hitungLuasIsi();

        System.out.println("Luas isi tabung = " + luas);
    }
}