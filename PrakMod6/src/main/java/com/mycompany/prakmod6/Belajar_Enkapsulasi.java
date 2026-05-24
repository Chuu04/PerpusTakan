/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prakmod6;

/**
 *
 * @author asus
 */
public class Belajar_Enkapsulasi 
{
    public static void main (String [] args)
    {
        Encapsulation objek = new Encapsulation();
        objek.ModifNama("Aulia Firti");
        objek.ModifAddress("jalan gatot No. 10 Medan");
        objek.ModifNim(191232009);
        System.out.println("nama: "+objek.getNama());
        System.out.println("Address: "+objek.getAddress());
        System.out.println("Nim: "+objek.getNim());
    }
    
}
