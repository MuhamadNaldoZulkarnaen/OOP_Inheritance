package PraktikumOOP;

public class OOP_MethodVoiddenganParameter {
    static void cetak2(int a){
        System.out.print(" Nilai x: "+a);
    }
    public static void main(String[] args) throws Exception {
        int x;
        for(x=0; x<3; x++){
            cetak2(x);
        }
        System.out.println(" Nilai x terakhir: " +x);
    }
}
