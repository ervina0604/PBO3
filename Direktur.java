/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3;

/**
 *
 * @author HP
 */
public class Direktur extends Pendiri implements PengambilKeputusan, PerencanaStrategis, ManajerTim {

    public void mengelolaPerusahaan() {
        System.out.println("Direktur mengelola perusahaan secara keseluruhan.");
    }

   @Override
    void visiPerusahaan() {
        System.out.println("Direktur mengembangkan visi dan misi perusahaan.");
    }

    @Override
    public void merencanakanStrategi() {
        System.out.println("Direktur merencanakan strategi jangka panjang.");
    }

    @Override
    public void mengelolaTim() {
        System.out.println("Direktur mengelola tim manajer untuk memastikan kelancaran operasional.");
    }

    @Override
    public void membuatKeputusanStrategis() {
        System.out.println("Direktur membuat keputusan strategis untuk pertumbuhan perusahaan.");
    }
               

}
