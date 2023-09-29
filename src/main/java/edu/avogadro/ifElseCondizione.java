package edu.avogadro;

import java.util.Scanner;


public class ifElseCondizione {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il primo numero: ");
        int primo = scanner.nextInt();

        System.out.print("Inserisci il secondo numero: ");
        int secondo = scanner.nextInt();

        if (primo > secondo) {
            System.out.println("Il primo numero è maggiore del secondo.");
        } else if (primo < secondo) {
            System.out.println("Il primo numero è minore del secondo.");
        } else {
            System.out.println("I due numeri sono uguali.");
        }
    }
}

