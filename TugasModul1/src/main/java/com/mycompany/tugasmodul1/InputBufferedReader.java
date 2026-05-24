package com.mycompany.tugasmodul1;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputBufferedReader {
    public static void main(String[] args) throws Exception {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        // Keliling Lingkaran
        System.out.print("Masukkan jari-jari lingkaran: ");
        double r = Double.parseDouble(br.readLine());

        double keliling = 2 * 3.14 * r;
        System.out.println("Keliling Lingkaran = " + keliling);

        // Luas Trapesium
        System.out.print("Masukkan sisi atas trapesium: ");
        double a = Double.parseDouble(br.readLine());

        System.out.print("Masukkan sisi bawah trapesium: ");
        double b = Double.parseDouble(br.readLine());

        System.out.print("Masukkan tinggi trapesium: ");
        double t = Double.parseDouble(br.readLine());

        double luasTrapesium = 0.5 * (a + b) * t;
        System.out.println("Luas Trapesium = " + luasTrapesium);

        // Luas Prisma Segitiga
        System.out.print("Masukkan alas segitiga: ");
        double alas = Double.parseDouble(br.readLine());

        System.out.print("Masukkan tinggi segitiga: ");
        double tinggiSegitiga = Double.parseDouble(br.readLine());

        System.out.print("Masukkan tinggi prisma: ");
        double tinggiPrisma = Double.parseDouble(br.readLine());

        double luasSegitiga = 0.5 * alas * tinggiSegitiga;
        double volumePrisma = luasSegitiga * tinggiPrisma;

        System.out.println("Volume Prisma Segitiga = " + volumePrisma);
    }
}