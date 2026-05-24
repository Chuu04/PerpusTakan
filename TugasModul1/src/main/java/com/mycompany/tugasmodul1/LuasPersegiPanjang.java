package com.mycompany.tugasmodul1;


class PersegiPanjang {
    double panjang;
    double lebar;

    void setNilai(double p, double l){
        panjang = p;
        lebar = l;
    }

    double hitungLuas(){
        return panjang * lebar;
    }
}

public class LuasPersegiPanjang {
    public static void main(String[] args){
        PersegiPanjang pp = new PersegiPanjang();

        pp.setNilai(18,7.5);

        System.out.println("Luas Persegi Panjang = " + pp.hitungLuas());
    }
}