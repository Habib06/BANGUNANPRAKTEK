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
public class BangunanAksi {
    public static void main(String[] args) {
        Bangunan Hotel = new Bangunan();
    
        Hotel.Jumlah_Kamar="50";
        Hotel.Lebar_Bangunan="40";
        Hotel.Tinggi_Bangunan="60";
        Hotel.Warna_Bangunan="Krim";
        Hotel.Fasilitas="Sarapan";
        
        Bangunan Apertemen = new Bangunan();
        Apertemen.Jumlah_Kamar="6,5";
        Apertemen.Lebar_Bangunan="5,5";
        Apertemen.Tinggi_Bangunan="60";
        Apertemen.Warna_Bangunan="Krim";
        Apertemen.Fasilitas="Londry";
        
        Bangunan KosKosan = new Bangunan();
        KosKosan.Jumlah_Kamar="30";
        KosKosan.Lebar_Bangunan="40";
        KosKosan.Tinggi_Bangunan="6";
        KosKosan.Warna_Bangunan="Banyak";
        KosKosan.Fasilitas="Cuci_Motor";
        
        Hotel.cetakInfo();
        Apertemen.cetakInfo();
        KosKosan.cetakInfo();
    }
 
}
