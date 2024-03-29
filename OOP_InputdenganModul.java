package PraktikumOOP;

import java.util.Scanner;

public class OOP_InputdenganModul {
    public static void main(String[] args){
        String nama, prodi, fakultas;
        Scanner input=new Scanner(System.in);
        System.out.print("Nama : ");
        nama = input.nextLine();
        System.out.print("Prodi : ");
        prodi = input.nextLine();
        System.out.print("Fakultas : ");
        fakultas = input.nextLine();
    }
}