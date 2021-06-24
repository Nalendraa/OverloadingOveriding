package overlaodingexp;

import barang.Barang;

/**
 *
 * @author Nalendraa
 */
public class OverlaodingExp {
    static Barang barang;

    public static void main(String[] args) {
       barang = new Barang("Ganggayaksa", "ASUS ROG", 14500000);
        int total_harga = barang.hitungHargaBeli(2);
        System.out.println("Total Harga : "+ total_harga);
        int bayar = 30000000;
        int kembalian = barang.sisaKembalian(bayar);
        System.out.println("Anda membayar : "+ bayar);
        System.out.println("Kembalian : "+ kembalian);
        
    }
    
}
