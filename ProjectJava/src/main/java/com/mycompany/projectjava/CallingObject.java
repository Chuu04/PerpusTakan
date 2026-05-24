package com.mycompany.projectjava;

class variable
{
    int lebar;
    int panjang;
}

@SuppressWarnings("unused")
class CallingObject{
public static void main(String[] args) 
{
    double luas;
    variable p = new variable();

    p.panjang = 20;
    p.lebar = 10;

    luas = p.panjang * p.lebar;

    System.out.println("Luas persegi: " + luas);
  }
}