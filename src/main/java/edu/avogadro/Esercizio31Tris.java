package edu.avogadro;

import javax.swing.*;

public class Esercizio31Tris {
    public static void main(String[] args) {
        double a = Double.parseDouble(JOptionPane.showInputDialog("Inserire il primo valore"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Inserire il secondo valore"));
        double c = Double.parseDouble(JOptionPane.showInputDialog("Inserire il terzo valore"));
        double d = Double.parseDouble(JOptionPane.showInputDialog("Inserire il terzo valore"));
        double min,max;
        if (a > b) {
            min = b;
            max = a;
        } else {
            min = a;
            max = b;
        }
        //min med max
        //c med max
        double med;
        if (c < min) {
            med = min;
            min = c;
        }else if (c < max) {
            med = c;
        } else {
            med = max;
            max = c;
        }
        //d med1 med2 max
        //min med1 med2 max
        double med1,med2;
        if (d < min) {
            med2 = med;
            med1 = min;
            min = d;
        } else if (d < med) {
            med1 = d;
            med2 = med;
        } else if (d < max) {
            med2 = d;
            med1 = med;
        }else{
            med1 = med;
            med2 = max;
            max = d;
        }
        JOptionPane.showMessageDialog(null, min + " " + med1 + " " + med2 + " "+ max);
    }
}