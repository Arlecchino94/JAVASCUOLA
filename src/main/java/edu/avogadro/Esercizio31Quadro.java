package edu.avogadro;

import javax.swing.*;

public class Esercizio31Quadro {
    public static void main(String[] args) {
        double a = Double.parseDouble(JOptionPane.showInputDialog("Inserire il primo valore"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Inserire il secondo valore"));
        double c = Double.parseDouble(JOptionPane.showInputDialog("Inserire il terzo valore"));
        double d = Double.parseDouble(JOptionPane.showInputDialog("Inserire il quarto valore"));
        double e = Double.parseDouble(JOptionPane.showInputDialog("Inserire il quinto valore"));
        double min,max;
        if (a > b) {
            min = b;
            max = a;
        } else {
            min = a;
            max = b;
        }
        double med1;
        if (c < min) {
            med1 = min;
            min = c;
        }else if (c < max) {
            med1 = c;
        } else {
            med1 = max;
            max = c;
        }
        //d med1 med2 max
        double med2;
        if (d < min) {
            med2 = med1;
            med1 = min;
            min = d;
        } else if (d < med1) {
            med1 = d;
            med2 = med1;
        } else if (d < max) {
            med2 = d;
            med1 = med1;
        }else{
            med1 = med1;
            med2 = max;
            max = d;
        }
        double med3 = 0.0;
         //e med1 med2 med3 max
        //min med1 med2 med3 max
        if (e < min) {
            med3 = med2;
            med2 = med1;
            med1 = min;
            min = e;

            //min e med2 med3 max
        } else if (e < med1) {
            med1 = e;
        } else if (e < med2) {
            med3 = med2;
            med2 = e;
        } else if ( e < med3) {
            med3 = e;
        }else if (e < max) {
            med3 = med2;
            med2 = med1;
            med1 = e;
        } else {
            med3 = med2;
            med2 = med1;
            med1 = max;
            max = e;
        }
        JOptionPane.showMessageDialog(null, min + " " + med1 + " " + med2 + " "+ med3 +" "+ max);
    }
}