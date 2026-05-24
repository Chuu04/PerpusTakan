/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.prakmod6;

/**
 *
 * @author asus
 */
public class MainMakhlukHidup {

    public void cekMakhlukHidup(MahklukHidup mHidup) 
    {
        mHidup.berdiri();
    }
    public static void main(String[] args)
    {
        MainMakhlukHidup mh = new MainMakhlukHidup();
        
        mh.cekMakhlukHidup(new Manusia("dua kaki"));
        
    }
}

