package PraktikumOOP;

public class OOP_MembuatObject { //nama kelas
    String nama; //atribut atau varibel
    String jurusan;
    public static void main(String[] args){
        OOP_MembuatObject mahasiswa1= new OOP_MembuatObject(); //object
        mahasiswa1.nama="Cinta Laura";
        mahasiswa1.jurusan="Teknik Informatika";
        OOP_MembuatObject mahasiswa2= new OOP_MembuatObject(); //object
        mahasiswa2.nama="Miley Cyrus";
        mahasiswa2.jurusan="Teknik Arsitektur";
        System.out.println(" Nama Mahasiswa : " +mahasiswa1.nama);
        System.out.println(" Jurusan : " +mahasiswa1.jurusan);
        System.out.println(" Nama Mahasiswa : " +mahasiswa2.nama);
        System.out.println(" Jurusan : " +mahasiswa2.jurusan);
    }
}

//    class Mahasiswa{ //nama kelas
//        String nama; //atribut atau varibel
//        String jurusan;
//        }
//public class PraktikumOOP.OOP_MembuatObject {
//    public static void main(String[] args){
//        Mahasiswa mahasiswa1= new Mahasiswa(); //object
//        mahasiswa1.nama="Cinta Laura";
//        mahasiswa1.jurusan="Teknik Informatika";
//        Mahasiswa mahasiswa2= new Mahasiswa(); //object
//        mahasiswa2.nama="Miley Cyrus";
//        mahasiswa2.jurusan="Teknik Arsitektur";
//        System.out.println(" Nama Mahasiswa : " +mahasiswa1.nama);
//        System.out.println(" Jurusan : " +mahasiswa1.jurusan);
//        System.out.println(" Nama Mahasiswa : " +mahasiswa2.nama);
//        System.out.println(" Jurusan : " +mahasiswa2.jurusan);
//    }
//}
