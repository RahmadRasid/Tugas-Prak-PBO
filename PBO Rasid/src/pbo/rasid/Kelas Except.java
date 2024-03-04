/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo.rasid;

/**
 *
 * @author ASUS ROG
 */
class Manajer extends Karyawan implements Pegawai {
    Manajer(String nama, double gaji) {
        super(nama, gaji);
    }

    @Override
    void hitungGaji() {
        gaji += 500; // Bonus untuk manajer
    }

    @Override
    public void bekerja() {
        System.out.println(nama + " sedang mengelola tugas.");
    }
}

class Resepsionis extends Karyawan implements Pegawai {
    Resepsionis(String nama, double gaji) {
        super(nama, gaji);
    }

    @Override
    void hitungGaji() {
        // Gaji tetap, tidak ada tambahan
    }

    @Override
    public void bekerja() {
        System.out.println(nama + " sedang menerima panggilan.");
    }
}

class Keamanan extends Karyawan implements Pegawai {
    Keamanan(String nama, double gaji) {
        super(nama, gaji);
    }

    @Override
    void hitungGaji() {
        // Gaji tetap, tidak ada tambahan
    }

    @Override
    public void bekerja() {
        System.out.println(nama + " sedang memantau keamanan.");
    }
}
