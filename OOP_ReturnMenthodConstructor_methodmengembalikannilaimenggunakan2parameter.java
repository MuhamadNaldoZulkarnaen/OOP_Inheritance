package PraktikumOOP;

public class OOP_ReturnMenthodConstructor_methodmengembalikannilaimenggunakan2parameter {
    static int penjumlahan(int bil1, int bil2) {
        return bil1 + bil2;
    }

    public static void main(String[] args) throws Exception {
        int x1 = 2;
        int x2 = 3;
        System.out.println(x1 + " + " + x2 + " = " + penjumlahan(x1, x2));
    }
}