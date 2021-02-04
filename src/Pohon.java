
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bintang.Ilham
 */
public class Pohon {
    //deklarasi variabel//
    String nama, tinggi; 
    //membuat objek scan dari class library scanner// 
    Scanner masukan = new Scanner(System.in);
    
    //method void setNama//
    void setNama(){
        System.out.print("Masukkan Nama Pohon : ");
        nama = masukan.nextLine();
    } 
    //method void setTinggi//
    void setTinggi(){
        //membuat inputan user//
        System.out.print("Masukkan Tinggi Pohon & Satuannya : ");
        tinggi = masukan.nextLine();
    }
    //method non void string//
    String getNama(){
        //pengembalian nilai nama//
        return nama;
    } 
    //method non void string//
    String getTinggi(){
        //pengembalian nilai tinggi//
        return tinggi;
    }
}

