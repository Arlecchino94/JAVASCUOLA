package edu.avogadro;

import javax.swing.*;

public class MacchinettaMerendine {
    public static void main(String[] args) {
        int patatine = Integer.parseInt(JOptionPane.showInputDialog("Inserire quante patatine sono rimaste"));
        int caramelle = Integer.parseInt(JOptionPane.showInputDialog("Inserire quante caramelle sono rimaste"));
        int cioccolato = Integer.parseInt(JOptionPane.showInputDialog("Inserire quanto cioccolato è rimasto"));
        int pat = 50;
        int car = 70;
        int cio = 100;
        int m10 = Integer.parseInt(JOptionPane.showInputDialog("Quante monete da 10 centesimi sono rimaste?"));
        int m20 = Integer.parseInt(JOptionPane.showInputDialog("Quante monete da 20 centesimi sono rimaste?"));
        int m50 = Integer.parseInt(JOptionPane.showInputDialog("Quante monete da 50 centesimi sono rimaste?"));
        int prezzo = 0;
        int somma = 0;
        String output ="";
        String output2 = "";

        String input = JOptionPane.showInputDialog("Vuoi comprare una merendina?" + "\n" +
                "Digitare: si o no");

        while (!input.equals("no")) {
            input = JOptionPane.showInputDialog("Scegliere tra: " + "\n" +
                    "1 -  Patatine" + " Rimanenti: "+patatine+ "\n" +
                    "2 -  Caramelle" + " Rimanenti: "+caramelle+"\n" +
                    "3 -  Cioccolato" + " Rimanente: "+cioccolato);
            int sel = Integer.parseInt(input);
            if (sel == 1 && patatine > 0) {
                output = String.format("Le patatine costano: %2.2f euro", 0.50);
                output2 = "Ritirare le patatine";
                JOptionPane.showMessageDialog(null, output);
                prezzo = pat;
            }else if (sel == 2 && caramelle > 0) {
                output = String.format("Le caramelle costano: %2.2f euro", 0.70);
                output2 = "Ritirare le caramelle";
                JOptionPane.showMessageDialog(null, output);
                prezzo = car;
            }else if (sel == 3 && cioccolato > 0) {
                output = String.format("Il cioccolato costa: %d euro", 1);
                output2 = "Ritirare il cioccolato";
                JOptionPane.showMessageDialog(null, output);
                prezzo = cio;
            }else{
                output2 = "Scelta non valida";
                prezzo = 0;

            }

            if (prezzo > 0) {
                int monete10 = Integer.parseInt(JOptionPane.showInputDialog("Inserire monete da 0.10"));
                int monete20 = Integer.parseInt(JOptionPane.showInputDialog("Inserire monete da 0.20"));
                int monete50 = Integer.parseInt(JOptionPane.showInputDialog("Inserire monete da 0.50"));
                int monete100 = Integer.parseInt(JOptionPane.showInputDialog("Inserire monete da 1.00"));

                somma = monete100 * 100 + monete20 * 20 + monete10 * 10 + monete50 * 50;
                m50 += monete50;
                m20 += monete20;
                m10 += monete10;
                if (somma < prezzo) {
                    prezzo = 0;
                    output2 = "Non hai abbastanza soldi";
                }
            }
            if (sel == 1 && prezzo > 0) {
                patatine--;
            }
            if (sel == 2 && prezzo > 0) {
                caramelle--;
            }
            if (sel == 3 && prezzo > 0) {
                cioccolato--;
            }
            int restotot = somma - prezzo;
            int restoout = restotot;
            int restino;
            int m50usate = restotot / 50;
            restotot = restotot % 50;
            if (m50usate > m50) {
                restino = (m50usate - m50) * 50;
                m50usate = m50;
                m50 = 0;
                restotot += restino;
            }else {
                m50 -= m50usate;
            }
            int m20usate = restotot / 20;
            restotot =  restotot % 20;
            if (m20usate > m20) {
                restino = (m20usate - m20) * 20;
                m20usate = m20;
                m20 = 0;
                restotot += restino;
            }else {
                m20 -= m20usate;
            }
            int m10usate = restotot / 10;
            restotot =  restotot % 10;
            if (m10usate > m10) {
                restino = (m10usate - m10) * 10;
                m10usate = m10;
                m10 = 0;
                restotot += restino;
            }else {
                m10 -= m10usate;
            }
            JOptionPane.showMessageDialog(null, output2);
            if (restotot > 0) {
                JOptionPane.showMessageDialog(null, "Ritira il resto di: "+ restoout + "centesimi"+"\n"+
                        "Ritira " + m50usate + " monete da 50 centesimi"+"\n"+
                        "Ritira "+ m20usate + " monete da 20 centesimi" + "\n"+
                        "Ritira "+ m10usate + " monete da 10 centesimi" + "\n"+
                        "Ti devo ancora: "+restotot +" centesimi" + "\n"+
                        "RITIRA LO SCONTRINO");
            }else {
                JOptionPane.showMessageDialog(null, "Ritira il resto di: "+ restoout + " centesimi"+ "\n"+
                        "Ritira " + m50usate + " monete da 50 centesimi"+"\n"+
                        "Ritira "+ m20usate + " monete da 20 centesimi" + "\n"+
                        "Ritira "+ m10usate + " monete da 10 centesimi" + "\n");
            }
            prezzo = 0;
            restotot = 0;
            restoout = 0;
            somma = 0;
            input = JOptionPane.showInputDialog("Vuoi continuare?");
        }
    }
}


