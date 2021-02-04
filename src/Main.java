/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bintang.Ilham
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {     
        //instance class pohon yang berisi 2 variable cemara & kelapa//
        Pohon cemara, kelapa;      
        //object//
        Pohon tampil = new Pohon();   
        //memanggil method void dari class pohon//
        tampil.setNama();
        tampil.setTinggi();
        
        System.out.println("------------------------------------------");
        //output dari  method non void dari class pohon//
        System.out.println("Nama Pohon : " +tampil.getNama());
        System.out.println("Tinggi Pohon : " +tampil.getTinggi());
    }  
}