/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3ulang.pkg10116049.latihan45.cetaknama;

import java.util.Scanner;

/**
 *
 * @author ibadguthwara
 * NAMA              : M. Ibad Guthwara
 * KELAS             : PBO 3 ULANG
 * NIM               : 10116049
 * DESKRIPSI PROGRAM : Membuat Program Mencetak Nama Berulang
 *  
 */
public class PBO3ULANG10116049Latihan45CetakNama {

    /**
     * @param args the command line arguments
     */
    private static int jmlCetak;
    private static String nama;
   
    public static void main(String[] args) {
        Scanner baca = new Scanner(System.in);        
        Printer objPrinter1 = new Printer();
        
        
        
        System.out.println("=====Aplikasi Pencetak Nama====="); 
        System.out.print("Masukan Nama Anda : " );
        nama = baca.next();
        System.out.print("Mau Cetak Nama Berapa Kali? : ");
        jmlCetak = baca.nextInt();
        objPrinter1.cetak(nama);
        objPrinter1.cetak(jmlCetak, nama);
       
        
    }
    
}
