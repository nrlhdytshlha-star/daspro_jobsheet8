import java.util.Scanner;
public class triangle26{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        // 1. segitiga siku siku normal (hasil perbaikan tahap 3)
        int i = 1; // perubahan 1: diubah dari 0 menjadi 1
        while (i<= n){
            int j = 0;
            while (j< i){
                System.out.print("*");
                j++;
            }
            System.out.println(); // perubahan ke 2: untuk
            i++;
        }
        System.out.println(); // memberi spasi antar segitiga

        // 2. segitiga terbalik (tambahan langkah 8)
        i =n; // cukup tulis '1= n;'
        while (i >= 1){
            int j = 0;
            while (j < i){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--; // supaya nilai berkurang darir 1 ke n
        }
        sc.close();
    }
}