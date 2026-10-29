import java.util.Scanner;
public class Tugas3_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah toko: ");
        int jumlahToko = sc.nextInt();

        int totalBarangSeluruhToko = 0;
        int maxbarang = -1;
        int tokoTerbanyak = 0;

        for (int i = 1; i <= jumlahToko; i++){
            System.out.println("Toko: " + i);
            System.out.print("Masukkan jumlah pelanggan: ");
            int jumlahPelanggan = sc.nextInt();

            int totalBarangToko = 0;

            for (int j = 1; j<= jumlahPelanggan; j++){
                System.out.print("Masukkanjumlah barang yang dibelu pelanggan ke-" + j +":");
                int jumlahBarang = sc.nextInt();
                totalBarangToko += jumlahBarang;
            }
            System.out.println("Toko "+ i + "- pelanggan: " + jumlahPelanggan +", total barang: " + totalBarangToko);
            totalBarangSeluruhToko += totalBarangToko;

            if(totalBarangToko > maxbarang){
                maxbarang = totalBarangToko;
                tokoTerbanyak = i;
            }
        }
        System.out.println("==========================");
        System.out.println("Total barang seluruh toko: " +totalBarangSeluruhToko);
        System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);
        sc.close();
    }
}
