package edu.avogadro;

import javax.swing.*;

public class Esercizio46DataGiornoDopo {
    public static void main(String[] args) {
        int giorno = Integer.parseInt(JOptionPane.showInputDialog("Inserire il giorno"));
        int mese = Integer.parseInt(JOptionPane.showInputDialog("Inserire il mese"));
        int anno = Integer.parseInt(JOptionPane.showInputDialog("Inserire l'anno"));
        if (giorno < 28) {
            giorno++;
        }else if (giorno == 28 && mese == 2) {
            giorno = 1;
            mese++;
        }else if (giorno == 29 && mese == 2) {
            giorno = 1;
            mese++;
        }else {
            giorno++;
        }
        if (mese > 12) {
            mese = 1;
            anno++;
        }
        JOptionPane.showMessageDialog(null, "La data del giorno successivo è :" +giorno+"-"+mese+"-"+anno);
    }
}
