package edu.avogadro;

import javax.swing.*;

public class Esercizio183 {
    public static void main(String[] args) {
        //Dire quante volte una parola compare nel testo
        String s = JOptionPane.showInputDialog("Inserire testo completo");
        String p = JOptionPane.showInputDialog("Inserire parola da controllare");
        int occ = 0;
        String output = "";
        for (int i = 0; i < s.length()-p.length()+1; i++) {
            String s1 = costruisciSottostringa(s,i,p.length());
            if (p.equals(s1)){
                occ++;
            }
        }
        JOptionPane.showMessageDialog(null, s+"\n"+occ);

    }

    public static String costruisciSottostringa(String s, int start, int lung){
        String ris = "";
        for (int i = 0; i < lung; i++) {
            char c = s.charAt(start+i);
            ris = ris+c;
        }
        return ris;
    }
}

