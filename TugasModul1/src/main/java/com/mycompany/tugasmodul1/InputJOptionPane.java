package com.mycompany.tugasmodul1;
import javax.swing.JOptionPane;

public class InputJOptionPane {
    public static void main(String[] args){

        // Keliling Lingkaran
        String rStr = JOptionPane.showInputDialog("Masukkan jari-jari lingkaran:");
        double r = Double.parseDouble(rStr);

        double keliling = 2 * 3.14 * r;

        JOptionPane.showMessageDialog(null, "Keliling Lingkaran = " + keliling);

        // Luas Trapesium
        String aStr = JOptionPane.showInputDialog("Masukkan sisi atas trapesium:");
        double a = Double.parseDouble(aStr);

        String bStr = JOptionPane.showInputDialog("Masukkan sisi bawah trapesium:");
        double b = Double.parseDouble(bStr);

        String tStr = JOptionPane.showInputDialog("Masukkan tinggi trapesium:");
        double t = Double.parseDouble(tStr);

        double luasTrapesium = 0.5 * (a + b) * t;

        JOptionPane.showMessageDialog(null, "Luas Trapesium = " + luasTrapesium);

        // Luas Prisma Segitiga
        String alasStr = JOptionPane.showInputDialog("Masukkan alas segitiga:");
        double alas = Double.parseDouble(alasStr);

        String tinggiSegStr = JOptionPane.showInputDialog("Masukkan tinggi segitiga:");
        double tinggiSegitiga = Double.parseDouble(tinggiSegStr);

        String tinggiPrismaStr = JOptionPane.showInputDialog("Masukkan tinggi prisma:");
        double tinggiPrisma = Double.parseDouble(tinggiPrismaStr);

        double luasSegitiga = 0.5 * alas * tinggiSegitiga;
        double volumePrisma = luasSegitiga * tinggiPrisma;

        JOptionPane.showMessageDialog(null, "Volume Prisma Segitiga = " + volumePrisma);
    }
}