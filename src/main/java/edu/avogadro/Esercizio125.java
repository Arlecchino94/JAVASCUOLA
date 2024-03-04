package edu.avogadro;

import javax.swing.*;

public class Esercizio125 {
    public static void main(String[] args) {
        //calcolare tutte le terne pitagoriche con valori < 100 cioè i numeri X Y Z < 100 tali che X^2+Y^2=Z^2
        String output = "";
        for (int x = 1; x <= 100; x++) {
            for (int y = 1; y <= 100; y++) {
                for (int z = 1; z <= 100; z++) {
                    if ((x ^ 2 + y ^ 2) == (z ^ 2)){
                        output +=  x +" "+y+" "+z+"\n";
                    }

                }

            }

        }
        JOptionPane.showMessageDialog(null, output);
    }
}
