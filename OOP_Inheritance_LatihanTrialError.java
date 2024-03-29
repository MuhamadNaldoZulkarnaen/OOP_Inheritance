package PraktikumOOP;


class Laptop1 extends Com {
    private String merk = "Asus";

    public String cekMerk() {
        return "Merk: " + merk;
    }

    public void turnOn() {
        System.out.println("Laptop dinyalakan.");
    }

    public String cekComFromLaptop() {
        return cekCom();
    }
}

public class OOP_Inheritance_LatihanTrialError {
    public static void main(String[] args) {
        Laptop1 laptopAndi = new Laptop1();

        System.out.println("Merk: " + laptopAndi.cekMerk());
        laptopAndi.turnOn();

        System.out.println("Processor: " + laptopAndi.processor);
        System.out.println("Model: " + laptopAndi.model);

        System.out.println(laptopAndi.cekComFromLaptop());
    }
}
