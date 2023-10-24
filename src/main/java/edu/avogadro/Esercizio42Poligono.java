package edu.avogadro;

import javax.swing.*;

public class Esercizio42Poligono {
    public static void main(String[] args) {
        double lato = Double.parseDouble(JOptionPane.showInputDialog("Inserire il lato"));
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserire il valore di n"));
        double perimetro,apotema,area;
        String output = "";

        if ( n < 3 ) {
            output = "non è un poligono";
        } else{
            perimetro = n*lato;
            apotema = lato / (2*Math.tan(Math.PI/n));
            area = perimetro*apotema/2;
            output = "Perimetro = "+perimetro+"\narea = "+area;
        }
        JOptionPane.showMessageDialog(null, output);



    }
}
