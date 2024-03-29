package PraktikumOOP;

import java.util.Scanner;

    class OOP_Encapsulation_ProjectBuku {
        private String judulBuku;
        private String pengarang;
        private int hargaBuku;
        private int jumlahPembelian;

        // Getter Setter untuk judulBuku
        public String getJudulBuku() {
            return judulBuku;
        }

        public void setJudulBuku(String judulBuku) {
            this.judulBuku = judulBuku;
        }

        // Getter Setter untuk pengarang
        public String getPengarang() {
            return pengarang;
        }

        public void setPengarang(String pengarang) {
            this.pengarang = pengarang;
        }

        // Getter Setter untuk hargaBuku
        public int getHargaBuku() {
            return hargaBuku;
        }

        public void setHargaBuku(int hargaBuku) {
            this.hargaBuku = hargaBuku;
        }

        // Getter Setter untuk jumlahPembelian
        public int getJumlahPembelian() {
            return jumlahPembelian;
        }

        public void setJumlahPembelian(int jumlahPembelian) {
            this.jumlahPembelian = jumlahPembelian;
        }

        // Method untuk menghitung total pembayaran
        public int hitungTotalPembayaran() {
            return hargaBuku * jumlahPembelian;
        }
    }

    class Main {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            OOP_Encapsulation_ProjectBuku buku = new OOP_Encapsulation_ProjectBuku();

            System.out.println("INPUT PEMBELIAN BUKU");
            System.out.print("Judul Buku: ");
            buku.setJudulBuku(input.nextLine());

            System.out.print("Pengarang: ");
            buku.setPengarang(input.nextLine());

            System.out.print("Harga Buku (Rp): ");
            buku.setHargaBuku(input.nextInt());

            System.out.print("Jumlah Pembelian: ");
            buku.setJumlahPembelian(input.nextInt());

            System.out.println("\nDATA PEMBELIAN");
            System.out.println("Judul Buku: " + buku.getJudulBuku());
            System.out.println("Pengarang: " + buku.getPengarang());
            System.out.println("Harga Buku (Rp): " + buku.getHargaBuku());
            System.out.println("Jumlah Pembelian: " + buku.getJumlahPembelian());

            System.out.println("\nTOTAL PEMBAYARAN");
            System.out.println("Total (Rp): " + buku.hitungTotalPembayaran());
        }
    }

