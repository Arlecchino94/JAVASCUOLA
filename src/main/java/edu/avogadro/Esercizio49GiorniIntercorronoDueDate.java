package edu.avogadro;

import javax.swing.*;

public class Esercizio49GiorniIntercorronoDueDate {
    public static void main(String[] args) {
        int giorno1 = Integer.parseInt(JOptionPane.showInputDialog("Inserire il giorno1"));
        int mese1 = Integer.parseInt(JOptionPane.showInputDialog("Inserire il mese1"));
        int anno1 = Integer.parseInt(JOptionPane.showInputDialog("Inserire l'anno1"));
        int ggFeb1 = 28;
        int cont1 = 0;
        if (anno1 % 4 == 0) {
            if (anno1 % 100 == 0) {
                if (anno1 % 400 == 0) {
                    ggFeb1 = 29;
                }
            } else {
                ggFeb1 = 29;
            }
        }
        if (mese1 > 1) {
            cont1 += 31;
        }
        if (mese1 > 2) {
            cont1 += ggFeb1;
        }
        if (mese1 > 3) {
            cont1 += 31;
        }
        if (mese1 > 4) {
            cont1 += 30;
        }
        if (mese1 > 5) {
            cont1 += 31;
        }
        if (mese1 > 6) {
            cont1 += 30;
        }
        if (mese1 > 7) {
            cont1 += 31;
        }
        if (mese1 > 8) {
            cont1 += 31;
        }
        if (mese1 > 9) {
            cont1 += 30;
        }
        if (mese1 > 10) {
            cont1 += 31;
        }
        if (mese1 > 11) {
            cont1 += 30;
        }
        cont1 += giorno1;

        int giorno2 = Integer.parseInt(JOptionPane.showInputDialog("Inserire il giorno1"));
        int mese2 = Integer.parseInt(JOptionPane.showInputDialog("Inserire il mese1"));
        int anno2 = Integer.parseInt(JOptionPane.showInputDialog("Inserire l'anno1"));
        int ggFeb2 = 28;
        int cont2 = 0;
        if (anno2 % 4 == 0) {
            if (anno2 % 100 == 0) {
                if (anno2 % 400 == 0) {
                    ggFeb2 = 29;
                }
            } else {
                ggFeb2 = 29;
            }
        }
        if (mese2 > 1) {
            cont2 += 31;
        }
        if (mese2 > 2) {
            cont2 += ggFeb2;
        }
        if (mese2 > 3) {
            cont2 += 31;
        }
        if (mese2 > 4) {
            cont2 += 30;
        }
        if (mese2 > 5) {
            cont2 += 31;
        }
        if (mese2 > 6) {
            cont2 += 30;
        }
        if (mese2 > 7) {
            cont2 += 31;
        }
        if (mese2 > 8) {
            cont2 += 31;
        }
        if (mese2 > 9) {
            cont2 += 30;
        }
        if (mese2 > 10) {
            cont2 += 31;
        }
        if (mese2 > 11) {
            cont2 += 30;
        }
        cont2 += giorno2;
        int giorniTrascorsiDaAnnoUno = (anno1 - 1) * 365 + (anno1 - 1) / 4 - (anno1 - 1) / 100 + (anno1 - 1) / 400 + cont1;
        int giorniTrascorsiDaAnnoUno2 = (anno2 - 1) * 365 + (anno2 - 1) / 4 - (anno2 - 1) / 100 + (anno2 - 1) / 400 + cont2;
        int diff = Math.abs(giorniTrascorsiDaAnnoUno - giorniTrascorsiDaAnnoUno2);
        JOptionPane.showMessageDialog(null, "I giorni tra le due date sono: " + diff);
    }
}

