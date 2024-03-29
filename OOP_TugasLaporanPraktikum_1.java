package PraktikumOOP;

class HitungLuas {

    // Method untuk menghitung luas isi tabung
    public static double luasIsiTabung(double jariJari, double tinggi) {
        return Math.PI * Math.pow(jariJari, 2) * tinggi;
    }

    // Method untuk menghitung luas persegi panjang
    public static double luasPersegiPanjang(double panjang, double lebar) {
        return panjang * lebar;
    }

    // Method untuk menghitung luas trapesium
    public static double luasTrapesium(double alas1, double alas2, double tinggi) {
        return ((alas1 + alas2) / 2) * tinggi;
    }
}

// Kelas PraktikumOOP.OOP_MembuatObject
class OOP_Membuat_Object {
    // Kosong, kelas ini tidak memiliki implementasi khusus
}

public class OOP_TugasLaporanPraktikum_1 {
    public static void main(String[] args) {
        // Inisialisasi objek dengan nama variabel yang berbeda
        OOP_MembuatObject objLuasIsiTabung = new OOP_MembuatObject();
        OOP_MembuatObject objLuasPersegiPanjang = new OOP_MembuatObject();
        OOP_MembuatObject objLuasTrapesium = new OOP_MembuatObject();

        // Contoh penggunaan method untuk menghitung luas isi tabung
        double jariJariTabung = 5;
        double tinggiTabung = 10;
        double luasTabung = HitungLuas.luasIsiTabung(jariJariTabung, tinggiTabung);
        System.out.println("Luas Isi Tabung: " + luasTabung);

        // Contoh penggunaan method untuk menghitung luas persegi panjang
        double panjangPersegi = 4;
        double lebarPersegi = 6;
        double luasPersegiPanjang = HitungLuas.luasPersegiPanjang(panjangPersegi, lebarPersegi);
        System.out.println("Luas Persegi Panjang: " + luasPersegiPanjang);

        // Contoh penggunaan method untuk menghitung luas trapesium
        double alas1Trapesium = 5;
        double alas2Trapesium = 7;
        double tinggiTrapesium = 8;
        double luasTrapesium = HitungLuas.luasTrapesium(alas1Trapesium, alas2Trapesium, tinggiTrapesium);
        System.out.println("Luas Trapesium: " + luasTrapesium);
    }
}
