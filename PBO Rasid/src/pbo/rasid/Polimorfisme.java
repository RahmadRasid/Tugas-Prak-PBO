/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo.rasid;

/**
 *
 * @author ASUS ROG
 */
public class Polimorfisme {
    public static void main(String[] args) {
        try {
            // Contoh penggunaan polimorfisme
            Karyawan[] karyawan = {
                    new Manajer("John", 30000),
                    new Resepsionis("Alice", 20000),
                    new Keamanan("Bob", 18000)
            };

            for (Karyawan krywn : karyawan) {
                krywn.hitungGaji();
                krywn.tampilkanInfo();
                if (krywn instanceof Pegawai) {
                    ((Pegawai) krywn).bekerja();
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
