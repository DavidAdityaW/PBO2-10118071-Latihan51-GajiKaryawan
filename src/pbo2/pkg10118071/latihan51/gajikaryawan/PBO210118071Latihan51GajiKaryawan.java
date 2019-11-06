/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118071.latihan51.gajikaryawan;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA              : David Aditya Winarto
 * KELAS             : PBO2
 * NIM               : 10118071
 * Deskripsi Program : Program ini berisi program untuk menghitung
 *                     gaji karyawan
 * 
 */
public class PBO210118071Latihan51GajiKaryawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        Manager m = new Manager();
        
        System.out.println("====Program Perhitungan Gaji Karyawan====");
        System.out.print("Masukkan NIK : ");
        m.setNik(input.next());
        
        input.nextLine();
        System.out.print("Masukkan Nama : ");
        m.setNama(input.nextLine());
        
        System.out.print("Masukkan Golongan (1/2/3) : ");
        m.setGolongan(input.nextInt());
        
        System.out.print("Masukkan Jabatan (Manager/Kabag) : ");
        m.setJabatan(input.next());
        
        System.out.print("Masukkan Jumlah Kehadiran : ");
        m.setKehadiran(input.nextInt());
        
        System.out.println("\n====Hasil Perhitungan====");
        System.out.println("NIK \t : " + m.getNik());
        System.out.println("NAMA \t : " + m.getNama());
        System.out.println("GOLONGAN : " + m.getGolongan());
        System.out.println("JABATAN  : " + m.getJabatan());
        
        System.out.println("\nTUNJANGAN GOLONGAN : " + m.tunjanganGolongan(m.getGolongan()));
        System.out.println("TUNJANGAN JABATAN    : " + m.tunjanganJabatan(m.getJabatan()));
        System.out.println("TUNJANGAN KEHADIRAN  : " + m.tunjanganKehadiran(m.getKehadiran()));
        
        System.out.println("\nGAJI TOTAL \t : " + m.gajiTotal());
    }   
}
