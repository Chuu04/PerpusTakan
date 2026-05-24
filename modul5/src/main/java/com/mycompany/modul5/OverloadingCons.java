package com.mycompany.modul5;

class Mahasiswa {
    String nama, nim, jurusan, fakultas;
    double ipSemester, ipk;

    // Constructor 1
    Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = "-";
        this.fakultas = "-";
        this.ipSemester = 0.0;
        this.ipk = 0.0;
    }

    // Constructor 2
    Mahasiswa(String nama, String nim, String jurusan, String fakultas) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.fakultas = fakultas;
        this.ipSemester = 0.0;
        this.ipk = 0.0;
    }

    // Constructor 3
    Mahasiswa(String nama, String nim, String jurusan, String fakultas, double ipSemester, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.fakultas = fakultas;
        this.ipSemester = ipSemester;
        this.ipk = ipk;
    }

    void tampil() {
        System.out.println("________________________________________");
        System.out.printf("%-15s : %s\n", "Nama", nama);
        System.out.printf("%-15s : %s\n", "NIM", nim);
        System.out.printf("%-15s : %s\n", "Jurusan", jurusan);
        System.out.printf("%-15s : %s\n", "Fakultas", fakultas);
        System.out.printf("%-15s : %.2f\n", "IP Semester", ipSemester);
        System.out.printf("%-15s : %.2f\n", "IPK", ipk);
    }
}

public class OverloadingCons {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa("Lukas", "11211001");
        Mahasiswa m2 = new Mahasiswa("Lukas", "11211001", "Informatika", "Teknik");
        Mahasiswa m3 = new Mahasiswa("Lukas", "11211001", "Informatika", "Teknik", 3.8, 3.7);

        m1.tampil();
        m2.tampil();
        m3.tampil();
    }
}