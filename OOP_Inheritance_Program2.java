package PraktikumOOP;

class Car1 extends Vehicle2 {
    private String modelName = "Mustang";
    public static void main(String[] args) {
        Car1 myCar = new Car1();
        myCar.honk();
        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}
