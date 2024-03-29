package PraktikumOOP;

import java.util.Scanner;

public class OOP_ReturnMenthodConstructor_KalkulatorSederhana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai integer x: ");
        int x = scanner.nextInt();

        System.out.print("Masukkan nilai integer y: ");
        int y = scanner.nextInt();

        System.out.println("Nilai x: " + x);
        System.out.println("Nilai y: " + y);

        int hasilPenjumlahan = penjumlahan(x, y);
        System.out.println("Hasil penjumlahan x dan y: " + hasilPenjumlahan);

        int hasilPengurangan = pengurangan(x, y);
        System.out.println("Hasil pengurangan x dan y: " + hasilPengurangan);

        int hasilPerkalian = perkalian(x, y);
        System.out.println("Hasil perkalian x dan y: " + hasilPerkalian);

        if (y != 0) {
            double hasilPembagian = pembagian(x, y);
            System.out.println("Hasil pembagian x dan y: " + hasilPembagian);
        } else {
            System.out.println("Tidak bisa melakukan pembagian dengan 0.");
        }
    }

    public static int penjumlahan(int bil1, int bil2) {
        return bil1 + bil2;
    }

    public static int pengurangan(int bil1, int bil2) {
        return bil1 - bil2;
    }

    public static int perkalian(int bil1, int bil2) {
        return bil1 * bil2;
    }

    public static double pembagian(int bil1, int bil2) {
        return (double) bil1 / bil2;
    }
}
