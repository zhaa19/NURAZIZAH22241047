package com.tutorial;

class Mahasiswa{
    String nama;
    String nim;
    String prodi;
}

public class Main {
    public static void main(String[] args) {
         //instansiasi objek dari class Mahasiswa
         Mahasiswa mhs1 = new Mahasiswa(); // proses instansiasi
 
         // memberi atribut pada objek mhs1
         mhs1.nama = "azizah";
        mhs1.nim  = "22241047";
        mhs1.prodi  = "pendidikan teknologi informasi";

        System.out.println("Nama : " + mhs1.nama);
        System.out.println("NIM : "+ mhs1.nim);
        System.out.println("Prodi :" + mhs1.prodi);
    }
}
