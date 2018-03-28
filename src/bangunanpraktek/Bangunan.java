/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunanpraktek;

/**
 *
 * @author Asus
 */
public class Bangunan {
    String Jumlah_Kamar;
    String Lebar_Bangunan;
    String Tinggi_Bangunan;
    String Warna_Bangunan;
    String Fasilitas;
    
    void cetakInfo(){
        System.out.println("Jumlah_Kamar        :"+Jumlah_Kamar);
        System.out.println("Lebar_Bangunan      :"+Lebar_Bangunan);
        System.out.println("Tinggi_Bangun       :"+Tinggi_Bangunan);
        System.out.println("Warna_Bangunan      :"+Warna_Bangunan);
        System.out.println("Fasilitas           :"+Fasilitas);
    }
}
