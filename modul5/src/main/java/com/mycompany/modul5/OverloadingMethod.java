package com.mycompany.modul5;

class MahasiswaMethod {

    void tampil(String nama, String nim, String jurusan, String fakultas) {

        double ipSemester = 3.8;
        double ipk = 3.7;
        String beasiswa = "Beasiswa Unggulan";

        System.out.println("Identitas Mahasiswa              Prestasi Akademik");
        System.out.println("__________________________________________________");

        System.out.printf("%-35s %-35s\n", "Nama : " + nama, "Nama : " + nama);
        System.out.printf("%-35s %-35s\n", "NIM : " + nim, "IP Semester : " + ipSemester);
        System.out.printf("%-35s %-35s\n", "Jurusan : " + jurusan, "IPK : " + ipk);
        System.out.printf("%-35s %-35s\n", "Fakultas : " + fakultas, "Beasiswa : " + beasiswa);
    }

    void tampil(String nama, double ipSemester, double ipk, String beasiswa) {
        System.out.println("Method Overloading Aktif");
    }
}

public class OverloadingMethod {
    public static void main(String[] args) {
        MahasiswaMethod mhs = new MahasiswaMethod();
        mhs.tampil("Lukas", "11211001", "Informatika", "Teknik");
    }
}