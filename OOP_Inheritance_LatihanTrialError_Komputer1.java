package PraktikumOOP;

class Com {
    protected String processor = "Intel Core i9";
    protected String model = "Desktop";

    protected String cekCom() {
        return "Ini berasal dari class Komputer";
    }

    public void turnOn() {
        System.out.println("Komputer dinyalakan.");
    }
}