package PraktikumOOP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OOP_TugasModul2 {
    static String nama, prodi, fakultas;
    static double NilaiPraktikumTugas, NilaiUTS, NilaiUAS;
    static void nilai() {
        double nilai = (NilaiPraktikumTugas + NilaiUTS + NilaiUAS) / 3;
    }

    static double hitungNilaiAkhir(double praktikumTugas, double uts, double uas) {
        return (praktikumTugas * 0.3) + (uts * 0.3) + (uas * 0.4);
    }

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("=====================INPUT DATA===========================");
        System.out.print("Nama : ");
        nama = br.readLine();
        System.out.print("Prodi : ");
        prodi = br.readLine();
        System.out.print("Fakultas : ");
        fakultas = br.readLine();
        System.out.print("NilaiPraktikumTugas : ");
        NilaiPraktikumTugas = Double.parseDouble(br.readLine());
        System.out.print("NilaiUTS : ");
        NilaiUTS = Double.parseDouble(br.readLine());
        System.out.print("NilaiUAS : ");
        NilaiUAS = Double.parseDouble(br.readLine());

        double NilaiAkhirMahasiswa = hitungNilaiAkhir(NilaiPraktikumTugas, NilaiUTS, NilaiUAS);
        System.out.println("=====================CETAK===========================");
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
        System.out.println("Fakultas: " + fakultas);
        System.out.println("Nilai Praktikum/Tugas: " + NilaiPraktikumTugas);
        System.out.println("Nilai UTS: " + NilaiUTS);
        System.out.println("Nilai UAS: " + NilaiUAS);
        System.out.println("=====================NILAI AKHIR===========================");
        System.out.println("Nilai Akhir Mahasiswa: " + NilaiAkhirMahasiswa);

        nilai();
    }
}




//Nama : Allin Junikhah
//Prodi: Teknik Informatika
//Fakultas: Sains dan teknologi
//Nilai Praktikum/Tugas: 85
//Nilai UTS: 77
//Nilai UAS : 95