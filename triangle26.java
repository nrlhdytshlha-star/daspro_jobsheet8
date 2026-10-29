import java.util.Scanner;
public class triangle26{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

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
        sc.close();
    }
}