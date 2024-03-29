package PraktikumOOP;

public class OOP_ReturnMenthodConstructor_MembuatConstructor {
        double radius;
        public OOP_ReturnMenthodConstructor_MembuatConstructor(){
            radius=10.0;
            System.out.println("Testing....");
        }
        public static void main(String[] args){
            OOP_ReturnMenthodConstructor_MembuatConstructor o = new OOP_ReturnMenthodConstructor_MembuatConstructor();
            System.out.println("radius = "+ o.radius);
        }
}
