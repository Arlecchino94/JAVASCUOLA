package edu.avogadro;

import javax.swing.*;

public class TPSI22{
    public static void main(String[] args) {
        // 2.Trovare la somma dei divisori di un numero (escluso il numero stesso) e determinare se è un numero abbondante,
        // perfetto o difettivo.
        // Un numero è abbondante se è più piccolo della somma dei suoi divisori,
        // è perfetto se è uguale alla somma dei suoi divisori e difettivo se maggiore alla somma dei suoi divisori.
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserire un numero"));
        int d = 0;
        String output = "";
        for (int i = 1; i < n; i++) {
             if ( n % i == 0 ) {
                 d += i;
             }
        }
        if (n < d) {
            output += "Il numero è abbondante";
        }
        if (n == d) {
            output += "Il numero è perfetto";
        }
        if (n > d) {
            output += "Il numero è difettivo";
        }
        JOptionPane.showMessageDialog(null, output);
    }
}
