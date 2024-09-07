/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3;

/**
 *
 * @author HP
 */
public class Karyawan extends Direktur {

    public void mengikutiPelatihan() {
        System.out.println("Karyawan mengikuti pelatihan untuk meningkatkan keterampilan.");
    }

    @Override
    public void mengelolaPerusahaan() {
        System.out.println("Karyawan mengelola perusahaan.");
    }

    // Overloading metode mengerjakanTugas
    public void mengerjakanTugas() {
        System.out.println("Karyawan mengerjakan tugas administrasi.");
    }

    public void mengerjakanTugas(String tugas) {
        System.out.println("Karyawan sedang " + tugas + ".");
    }

    public String mengerjakanTugas(int jam) {
        return "Karyawan bekerja selama " + jam + " jam.";
    }

    public void tampilkanDetail() {
        this.mengelolaPerusahaan(); // Memanggil metode overriding di kelas Karyawan
        super.mengelolaPerusahaan(); // Memanggil metode superclass Direktur
        this.visiPerusahaan(); // Memanggil metode yang dioverride dari superclass Pendiri
        this.sejarahPerusahaan(); // Memanggil metode dari superclass Pendiri
    }
}
