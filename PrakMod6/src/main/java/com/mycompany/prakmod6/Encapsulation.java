/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prakmod6;

/**
 *
 * @author asus
 */
public class Encapsulation 
{
    private String nama;
    private String address;
    private int nim;
    
    public String getNama()
    {
        return this.nama;
    }
    public String getAddress()
    {
        return this.address;
    }
    public int getNim()
    {
        return this.nim;
    }
    public void ModifNama(String nama)
    {
        this.nama = nama;
    }
    public void ModifAddress(String address)
    {
        this.address = address;
    }
    public void ModifNim(int nim)
    {
        this.nim = nim;
    }
}
