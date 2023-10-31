package edu.avogadro;

import javax.swing.*;

public class Esercizio48GiornoDataPrecisa {
    public static void main(String[] args) {
        int giorno = Integer.parseInt(JOptionPane.showInputDialog("Inserire il giorno"));
        int mese = Integer.parseInt(JOptionPane.showInputDialog("Inserire il mese"));
        int anno = Integer.parseInt(JOptionPane.showInputDialog("Inserire l'anno"));
        int ggA = Integer.parseInt(JOptionPane.showInputDialog("Inserisci il giorno della settimana compreso tra 1 lunedi e 7 domenica"));
        int ggFeb = 28;
        int cont = 0;
        if (anno % 4 == 0) {
            if (anno % 100 == 0) {
                if (anno % 400 == 0) {
                    ggFeb = 29;
                }
            } else {
                ggFeb = 29;
            }
        }
        if (mese > 1) {
            cont += 31;
        }
        if (mese > 2) {
            cont += ggFeb;
        }
        if (mese > 3) {
            cont += 31;
        }
        if (mese > 4) {
            cont += 30;
        }
        if (mese > 5) {
            cont += 31;
        }
        if (mese > 6) {
            cont += 30;
        }
        if (mese > 7) {
            cont += 31;
        }
        if (mese > 8) {
            cont += 31;
        }
        if (mese > 9) {
            cont += 30;
        }
        if (mese > 10) {
            cont += 31;
        }
        if (mese > 11) {
            cont += 30;
        }
        cont +=giorno;
        int ggSett = (cont-1)%7 + ggA;
        if (ggSett > 7) {
            ggSett = ggSett - 7;
        }
        JOptionPane.showMessageDialog(null, "Il giorno della settimana è: "+ggSett);
    }
}
