
package com.mycompany.tugasmodul1;
import java.util.Scanner;


public class INputScanner {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jari-jari lingkaran: ");
        double r = sc.nextDouble();

        double keliling = 2 * 3.14 * r;
        System.out.println("Keliling Lingkaran = " + keliling);

        System.out.print("Masukkan sisi atas trapesium: ");
        double a = sc.nextDouble();

        System.out.print("Masukkan sisi bawah trapesium: ");
        double b = sc.nextDouble();

        System.out.print("Masukkan tinggi trapesium: ");
        double t = sc.nextDouble();

        double luasTrap = 0.5 * (a + b) * t;
        System.out.println("Luas Trapesium = " + luasTrap);

        System.out.print("Masukkan alas prisma: ");
        double alas = sc.nextDouble();

        System.out.print("Masukkan tinggi segitiga: ");
        double tinggi = sc.nextDouble();

        System.out.print("Masukkan tinggi prisma: ");
        double tinggiPrisma = sc.nextDouble();

        double luasSegitiga = 0.5 * alas * tinggi;
        double volumePrisma = luasSegitiga * tinggiPrisma;

        System.out.println("Volume Prisma Segitiga = " + volumePrisma);
    }
}