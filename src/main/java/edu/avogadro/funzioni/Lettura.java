package edu.avogadro.funzioni;

import javax.swing.*;

public class Lettura {
    public static int lettura(String msg){
        return Integer.parseInt(JOptionPane.showInputDialog(msg));
    }
}
