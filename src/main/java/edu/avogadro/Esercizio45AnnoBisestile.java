package edu.avogadro;

import javax.swing.*;

public class Esercizio45AnnoBisestile {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Inserire un anno"));
        String output = "";
         if (a % 4 == 0) {
             if (a % 100 == 0) {
                 if (a % 400 == 0) {
                     output = "bisestile";
                 }else{
                     output = "non è bisestile";
                 }
             }else {
                 output = "bisestile";
             }
         }else {
             output = "non è bisestile";
         }
         JOptionPane.showMessageDialog(null, output);
    }
}
