



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo.rasid;

/**
 *
 * @author ASUS ROG
 */
abstract class Karyawan {
    String nama;
    double gaji;

    Karyawan(String nama, double gaji) {
        this.nama = nama;
        this.gaji = gaji;
    }

    abstract void hitungGaji();

    void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Gaji: Rp" + gaji);
    }
}
