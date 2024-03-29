package PraktikumOOP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OOP_BufferReader {
    public static void main(String[] args) throws IOException {
        String nama, prodi, fakultas;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("Nama : ");
        nama = br.readLine();
        System.out.print("Prodi : ");
        prodi = br.readLine();
        System.out.print("Fakultas : ");
        fakultas = br.readLine();
    }
}