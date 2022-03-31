package com.company;

class Mahasiswa{
    String nama;
    String npm;
    String prodi;
    Buku judul;

    //Method
    void pinjamBuku(Buku paramJudul){
        judul = paramJudul;
    }

    //constractor
    Mahasiswa(String paramNama, String paramNpm, String paramProdi){
        nama = paramNama;
        npm = paramNpm;
        prodi = paramProdi;
    }

    //Method
    void detailMahasiswa(){
        System.out.println("Nama            : " + nama);
        System.out.println("NPM             : " + npm);
        System.out.println("Program Studi   : " + prodi);
        judul.detailBuku();
        System.out.println("---------------------------------------------------------");
    }

}

class Buku{
    String namaBuku;
    String kodeBuku;
    String tglPinjam;
    String tglKembali;

    //Constructor
    Buku(String paramNamaBuku, String paramKodeBuku, String paramPinjam, String paramKembali){
        namaBuku = paramNamaBuku;
        kodeBuku = paramKodeBuku;
        tglPinjam = paramPinjam;
        tglKembali = paramKembali;

    }
    void detailBuku(){
        System.out.println("Buku Dipinjam   : " + namaBuku);
        System.out.println("Kode Buku       : " + kodeBuku);
        System.out.println("Tanggal Pinjam  : " + tglPinjam);
        System.out.println("Tanggal Kembali : " + tglKembali);
    }

}

public class Main {

    public static void main(String[] args) {
        Mahasiswa putri = new Mahasiswa("Putri", "2015061061", "Teknik Informatika");
        Buku PBO = new Buku("Pemrograman Berbasis Objek", "1290", "22 April 2022", "29 April 2022");
        putri.pinjamBuku(PBO);
        putri.detailMahasiswa();

        Mahasiswa seruni = new Mahasiswa("Seruni", "1912071088", "Teknik Sipil");
        Buku kalkulus = new Buku("Kalkulus", "1022", "23 April 2022", "30 April 2022");
        seruni.pinjamBuku(kalkulus);
        seruni.detailMahasiswa();
    }
}
