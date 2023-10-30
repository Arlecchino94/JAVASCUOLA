package edu.avogadro;

import javax.swing.*;

public class Esercizio46Plus {
    public static void main(String[] args) {
        int giorno = Integer.parseInt(JOptionPane.showInputDialog("Inserire il giorno"));
        int mese = Integer.parseInt(JOptionPane.showInputDialog("Inserire il mese"));
        int anno = Integer.parseInt(JOptionPane.showInputDialog("Inserire l'anno"));
        int ggFeb;
        if (anno % 4 == 0) {
            if (anno % 100 == 0) {
                if (anno % 400 == 0) {
                    ggFeb = 29;
                } else {
                    ggFeb = 28;
                }
            } else {
                ggFeb = 29;
            }
        } else {
            ggFeb = 28;
        }
        giorno = giorno +1;
        if (mese == 2) {
            if (giorno == ggFeb +1) {
                giorno = 1;
                mese = 3;
            }
        }else if (mese == 4 || mese == 6 || mese == 9 || mese == 11) {
            if (giorno == 31) {
                giorno = 1;
                mese = mese + 1;
            }
        }else if (giorno == 32) {
            giorno = 1;
            mese = mese +1;
        }if (mese == 13) {
            mese = 1;
            anno = anno +1;
        }
        JOptionPane.showMessageDialog(null, "La data successiva è: "+giorno+"-"+mese+"-"+anno);
    }

}