/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balok;

/**
 *
 * @author MOKLET-2
 */
public class Balok {

    /**
     * @param args the command line arguments
     */
    // Variabel Instance
    int panjang;
    int lebar;
    int tinggi;
    int luasPermukaan;
    int volume;
     
    // Method Void Judul
    void judul(){
        System.out.println("======================================");
        System.out.println("      PROGRAM BANGUN RUANG BALOK      ");
        System.out.println("======================================");
    }
    
    // Parameter
    void Balok(int panjang, int lebar, int tinggi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    
    // Method Luas Permukaan
    void luasPermukaan(){
        luasPermukaan = (panjang*lebar) + (panjang*tinggi) + (lebar*tinggi);
        System.out.println("Luas Permukaan Balok Adalah : "+luasPermukaan+ " cm^2");
    }   
    
    // Method Void Volume
    void volume(){
        volume = panjang*lebar*tinggi;
        System.out.println("Volume Balok Adalah : "+volume+ " cm^3");
    }
    
    // Method Void Akhiran
    void akhiran(){
        System.out.println("=======================================");
    }
}
