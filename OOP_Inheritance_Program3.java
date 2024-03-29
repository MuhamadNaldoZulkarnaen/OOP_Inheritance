package PraktikumOOP;

class Laptop extends Komputer {
    String merk = "Asus";
    String cekLaptop() {
        return "Ini berasal dari class Laptop";
    }
}
class belajarInheritance {
    public static void main(String args[]){
        Laptop laptopAndi = new Laptop();
        System.out.println(laptopAndi.processor);
        System.out.println(laptopAndi.merk);
        System.out.println(laptopAndi.cekKomputer());
        System.out.println(laptopAndi.cekLaptop());
    }
}