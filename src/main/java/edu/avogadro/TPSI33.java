package edu.avogadro;

import javax.swing.*;

public class TPSI33 {
    public static void main(String[] args) {
        // 3.Disegnare un rettangolo vuoto di '*' data l’altezza e la base.
        //Es. se l'utente inserisce 5 di altezza e 4 di base:
        //
        //****
        //*   *
        //*   *
        //*   *
        //****

        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserire altezza"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Inserire base"));
        String output = "";
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= b; j++) {
                if (i == 1 || i == n || j == 1 || j == b) {
                    output += "*";
                }else{
                    output += " ";
                }
            }
            output += "\n";
        }
        JOptionPane.showMessageDialog(null, output);
    }
}