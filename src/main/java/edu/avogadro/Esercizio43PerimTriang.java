package edu.avogadro;

import javax.swing.*;

public class Esercizio43PerimTriang {
    public static void main(String[] args) {
        double a = Double.parseDouble(JOptionPane.showInputDialog("Inserire il valore del lato"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Inserire il valore del lato"));
        double c = Double.parseDouble(JOptionPane.showInputDialog("Inserire il valore del lato"));
        String output = "";
        if (a == b && b == c && c == a){
            output = "è un triangolo equilatero";
        }else if (a == b || b == c || c == a) {
            output = "è un triangolo isoscele";
        }else {
            output = "è un triangolo scaleno";
        }
        double perimetro = a+b+c;
        double p = perimetro/2;
        double area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        JOptionPane.showMessageDialog(null, "triangolo "+output+"\npreimetro = "+p+"\narea = "+area);

    }
}
