package edu.avogadro;

import javax.swing.*;

public class Esercizio124 {
    public static void main(String[] args) {
        //Calcolare tutti i numeri X Y Z minori di 100 tali che X * Y * Z = X +Y +Z
        String output = "";
        for (int x = 1; x < 100; x++) {
            for (int y = 1; y < 100; y++) {
                for (int z = 1; z < 100; z++) {
                    if (x*y*z == x+y+z) {
                        output = output + x + " "+ y +" "+z+"\n";
                    }

                }

            }

        }
        JOptionPane.showMessageDialog(null, output);


    }
}
