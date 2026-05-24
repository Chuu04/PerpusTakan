/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prakmod6;

/**
 *
 * @author asus
 */
public class Manusia extends MahklukHidup
{
    private String duaKaki;
    private String bernafas;
    
    public Manusia(String duaKaki)
    {
        this.duaKaki = duaKaki;
    }
    
    public void berdiri()
            {
                System.out.println("manusia berdiri menggunakan : "+duaKaki);
            }
}
