package PraktikumOOP;

public class OOP_MemodifikasiAtribut {
    String nama ="Cinta Laura";
    String jurusan ="Teknik Informatika";
    public static void main(String[] args){
        OOP_MemodifikasiAtribut mahasiswa= new OOP_MemodifikasiAtribut(); //object
        mahasiswa.nama="Jerome Polin";
        System.out.println(" Nama Mahasiswa : " +mahasiswa.nama);
        System.out.println(" Jurusan : " +mahasiswa.jurusan);
    }
}

