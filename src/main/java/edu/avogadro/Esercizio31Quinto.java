package edu.avogadro;

import javax.swing.*;

public class Esercizio31Quinto {
    public static void main(String[] args) {
        double a = Double.parseDouble(JOptionPane.showInputDialog("Inserire il primo valore"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Inserire il secondo valore"));
        double c = Double.parseDouble(JOptionPane.showInputDialog("Inserire il terzo valore"));
        double d = Double.parseDouble(JOptionPane.showInputDialog("Inserire il quarto valore"));
        double e = Double.parseDouble(JOptionPane.showInputDialog("Inserire il quinto valore"));
        double f = Double.parseDouble(JOptionPane.showInputDialog("Inserire il sesto valore"));
        double g = Double.parseDouble(JOptionPane.showInputDialog("Inserire il settimo valore"));
        double min,max;
        if (a > b) {
            min = b;
            max = a;
        } else {
            min = a;
            max = b;
        }
        double med1;
        //min med1 max
        //c med1 max
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
        //min med1 med2 med3 med4 med5 med6 max
        // f  min  med1 med2 med3 med4 med5 max
        double med4 = 0.0;
        double med5 = 0.0;
        double med6 = 0.0;
        if (f < min) {
            med6 = med5;
            med5 = med4;
            med4 = med3;
            med3 = med2;
            med2 = med1;
            med1 = min;
            min = f;
            // min med1 med2 med3 med4 med5 med6 max
            // min  f   med1 med2 med3 med4 med5 max
        } else if (f < med1) {
            med6 = med5;
            med5 = med4;
            med4 = med3;
            med3 = med2;
            med2 = med1;
            med1 = f;
            // min med1 med2 med3 med4 med5 med6 max
            // min med1  f   med2 med3 med4 med5 max
        } else if (f < med2) {
            med6 = med5;
            med5 = med4;
            med4 = med3;
            med3 = med2;
            med2 = f;
            // min med1 med2 med3 med4 med5 med6 max
            // min med1 med2 f    med3 med4 med5 max
        }else if (f < med3) {
            med6 = med5;
            med5 = med4;
            med4 = med3;
            med3 = f;
            // min med1 med2 med3 med4 med5 med6 max
            // min med1 med2 med3  f   med4 med5 max
        }else if (f < med4) {
            med6 = med5;
            med5 = med4;
            med4 = f;
            // min med1 med2 med3 med4 med5 med6 max
            // min med1 med2 med3 med4 f    med5 max
        } else if (f < med5) {
            med6 = med5;
            med5 = f;
            // min med1 med2 med3 med4 med5 med6 max
            // min med1 med2 med3 med4 med5  f max
        }else if (f < med6) {
            med6 = f;
        } else if (f < max) {
            med6 = max;
            max = f;
        }
        if (f < min) {
            med6 = med5;
            med5 = med4;
            med4 = med3;
            med3 = med2;
            med2 = med1;
            med1 = min;
            min = f;
            // min med1 med2 med3 med4 med5 med6 max
            // min  f   med1 med2 med3 med4 med5 max
        } else if (f < med1) {
            med6 = med5;
            med5 = med4;
            med4 = med3;
            med3 = med2;
            med2 = med1;
            med1 = f;
            // min med1 med2 med3 med4 med5 med6 max
            // min med1  f   med2 med3 med4 med5 max
        } else if (f < med2) {
            med6 = med5;
            med5 = med4;
            med4 = med3;
            med3 = med2;
            med2 = f;
            // min med1 med2 med3 med4 med5 med6 max
            // min med1 med2 f    med3 med4 med5 max
        }else if (f < med3) {
            med6 = med5;
            med5 = med4;
            med4 = med3;
            med3 = f;
            // min med1 med2 med3 med4 med5 med6 max
            // min med1 med2 med3  f   med4 med5 max
        }else if (f < med4) {
            med6 = med5;
            med5 = med4;
            med4 = f;
            // min med1 med2 med3 med4 med5 med6 max
            // min med1 med2 med3 med4 f    med5 max
        } else if (f < med5) {
            med6 = med5;
            med5 = f;
            // min med1 med2 med3 med4 med5 med6 max
            // min med1 med2 med3 med4 med5  f max
        }else if (f < med6) {
            med6 = f;
        } else if (f < max) {
            med6 = max;
            max = f;
        }
        double med7;
        //min med1 med2 med3 med4 med5 med6 med7 max
        // g  min med1 med2 med3 med4 med5 med6 max
        if (g < min) {
            med7 = med6;
            med6 = med5;
            med5 = med4;
            med4 = med3;
            med3 = med2;
            med2 = med1;
            med1 = min;
            min = g;
        }else if (g < med1) {
            med7 = med6;
            med6 = med5;
            med5 = med4;
            med4 = med3;
            med3 = med2;
            med2 = med1;
            med1 = g;
        }else if (g < med2) {
            med7 = med6;
            med6 = med5;
            med5 = med4;
            med4 = med3;
            med3 = med2;
            med2 = g;
        }else if (g < med3) {
            med7 = med6;
            med6 = med5;
            med5 = med4;
            med4 = med3;
            med3 = med2;
            med2 = med1;
        }else if (g < med4) {
            med7 = med6;
            med6 = med5;
            med5 = med4;
            med4 = med3;
            med3 = med2;
            med2 = g;
        }else if (g < med5) {
            med7 = med6;
            med6 = med5;
            med5 = med4;
            med4 = med3;
            med3 = me;


        JOptionPane.showMessageDialog(null, min + " " + med1 + " " + med2 + " "+ med3 +" "+med4 + "" + med5 + "" + med6 + "" + max);
    }
}