package edu.avogadro;

import javax.swing.*;

public class Esercizio43PerimTriang {
    public static void main(String[] args) {
        double a = Double.parseDouble(JOptionPane.showInputDialog("Inserire il valore del lato"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Inserire il valore del lato"));
        double c = Double.parseDouble(JOptionPane.showInputDialog("Inserire il valore del lato"));
        double max = a;

        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        double sommaR = a + b + c - max;
        String output = "";
        if (max < sommaR) {
            if (a == b && b == c) {
                output = "è un triangolo equilatero";
            } else if (a == b || b == c || c == a) {
                output = "è un triangolo isoscele";
            } else {
                output = "è un triangolo scaleno";
            }
            if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
                output = output + " rettangolo";
            }
            double perimetro = a + b + c;
            double p = perimetro / 2;
            double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            output = "Triangolo " +output + "\npreimetro = "+ perimetro+"\narea = "+area;
        }else {
            output = "non è un triangolo";
        }
    }
}
