package com.mycompany.belajarinput;
import java.util.Scanner;

class BelajarInput {

    public static void main(String[] args) 
    {
        String nama, jurusan, fakultas, universitas;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Nama: ");
        nama = input.nextLine();
        
        System.out.print("Jurusan: ");
        jurusan = input.nextLine();
        
        System.out.print("fakultas: ");
        fakultas = input.nextLine();
        
        System.out.print("Universitas: ");
        universitas = input.nextLine();
    }
}
