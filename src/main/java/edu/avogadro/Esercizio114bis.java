package edu.avogadro;

import javax.swing.*;

public class Esercizio114bis {
    public static void main(String[] args) {
        //Stampare la fattorizzazione in numeri primi di N con la notazione esponenziale
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserisci un numero"));
        int esponente = 0;
        int fatt = 1;
        int cont = 2;
        String output = "";
        while ( n > fatt) {

            if (n % cont == 0) {
                if (esponente == 0) {
                    output += (output.equals("")?"":",")+cont+"^";
                n /= cont;

            }else {
                    if (esponente > 0) {
                        output += esponente;
                    }
                    esponente = 0;
                cont++;
            }
        }
            if (esponente > 0) {
                output += esponente;
            }
        JOptionPane.showMessageDialog(null, output);
    }
}

}
