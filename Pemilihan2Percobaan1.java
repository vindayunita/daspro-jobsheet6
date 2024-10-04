import java.util.Scanner;

public class Pemilihan2Percobaan1 {

    public static void main(String[] args) {
        Scanner input24 = new Scanner(System.in);

        System.out.println("Masukkan Tahun");
        int tahun = input24.nextInt();

        if ((tahun % 4) == 0) {
            if ((tahun % 100) != 0) {
                System.out.println("Tahun kabisat");
            }
        } else 
            System.out.println("Bukan Tahun Kabisat");
        if ((tahun % 4) == 0) {
            if ((tahun % 100) == 0) {
                System.out.println("Bukan Tahun Kabisat");
            }
        }
        }
    }
