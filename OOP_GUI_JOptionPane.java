package PraktikumOOP;

import javax.swing.*;

public class OOP_GUI_JOptionPane {
    public static void main(String[] args){
        String nama,prodi,fakultas;
        nama= JOptionPane.showInputDialog("Nama : ");
        prodi=JOptionPane.showInputDialog("Prodi : ");
        fakultas=JOptionPane.showInputDialog("Fakultas : ");
        String msg = "Nama : " + nama + "\nProdi :" + prodi+"\nFakultas :" +
                fakultas;
        JOptionPane.showMessageDialog(null, msg);;
    }
}
