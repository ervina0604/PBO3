/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan3;

/**
 *
 * @author HP
 */
public class Utama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Karyawan sampel = new Karyawan();
        //abstract
        sampel.visiPerusahaan();
        //override
        sampel.tampilkanDetail();
        System.out.println(" ");
        //overload
        sampel.mengerjakanTugas();
        sampel.mengerjakanTugas("mengelola laporan keuangan");
        System.out.println(sampel.mengerjakanTugas(5));

    }

}
