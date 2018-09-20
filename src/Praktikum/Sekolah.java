/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

/**
 *
 * @author Aby
 */
public class Sekolah {
    String sekolah;
    String nmjurusan;
    int jurusan;
    int jumlahGuru;
    String Guru;
    public void setSekolah(String newSekolah){
        this.sekolah= newSekolah;
        System.out.println("Nama Sekolah : "+sekolah);
    }
    public void setJurusan(String newJurusan){
        this.nmjurusan = newJurusan;
        System.out.println("Nama Jurusan : "+jurusan);
    } public void setJurusan(int newJumlah){
        this.jurusan = newJumlah;
        System.out.println("Jumlah Jurusan : "+jurusan);
    }
    public void setGuru(String newGuru){
        this.Guru = newGuru;
        System.out.println("Nama Guru : "+Guru);
    }
    public void setJumlahGr(int newJumlahGuru){
        this.jumlahGuru = newJumlahGuru;
        System.out.println("Jumlah Guru : "+jumlahGuru);
    }
}
