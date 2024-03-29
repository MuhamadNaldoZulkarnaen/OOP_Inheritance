package PraktikumOOP;

class Kali {
    double a;
    double b;

    public void hasilKali() {
        double c = a * b;
        System.out.println("Hasil Perkalian: " + a + " x " + b + " = " + c);
    }
}

public class OOP_MembuatMenthod {
    public static void main(String[] args) {
        Kali objKali = new Kali();
        objKali.a = 34;
        objKali.b = 21;
        objKali.hasilKali();
    }
}
