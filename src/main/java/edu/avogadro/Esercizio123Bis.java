package edu.avogadro;

import javax.swing.*;

public class Esercizio123Bis {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserire un numero"));
        String seq = "";
        String seqMax = "";
        int contSeq = 0;
        int contSeqMax = 0;
        for (int i = 1; i < n; i++) {
            int div = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    div++;
                }
            }
            if (div != 2) {
                seq = seq + " " + i;
                contSeq++;
            }else {
                if (contSeq > contSeqMax) {
                    seqMax = seq;
                    contSeqMax = contSeq;
                }
                seq = "";
                contSeq = 0;
            }
            if (contSeq > contSeqMax) {
                seqMax = seq;
                contSeqMax = contSeq;
            }
        }
        JOptionPane.showMessageDialog(null, seqMax);
    }
}
