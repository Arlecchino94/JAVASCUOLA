package edu.avogadro;

import javax.swing.*;

public class TPSI3 {

        public static void main(String[] args) {
            int n = Integer.parseInt(JOptionPane.showInputDialog("Inserire numero"));
            String output = "";

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (i == 1 || i == n || j == 1 || j == n) {
                        output += "* ";
                    } else {
                        output += ("  ");
                    }
                }
                output += "\n";
            }
            JOptionPane.showMessageDialog(null, output);
        }
    }
