package PraktikumOOP;

public class OOP_Encapsulation_Program3  {
    private String username;
    private String password;
    // ini method setter
    public void setUsername(String username){
        this.username = username;
    }
    public void setPassword(String password){
        this.password = password;
    }
    // ini method getter
    public String getUsername(){
        return this.username;
    }
    public String getPassword(){
        return this.password;
    }
    public static void main(String[] args){
        OOP_Encapsulation_Program3 obj = new OOP_Encapsulation_Program3();
// menggunakan method setter
        obj.setUsername("blackpink");
        obj.setPassword("TeknikInformatika");
// menggunakan method getter
        System.out.println("Username: " + obj.getUsername());
        System.out.println("Password: " + obj.getPassword());
    }
}

