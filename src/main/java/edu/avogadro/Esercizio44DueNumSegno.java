package edu.avogadro;

import java.util.Scanner;

public class Esercizio44DueNumSegno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il primo numero: ");
        double num1 = scanner.nextDouble();

        System.out.print("Inserisci il secondo numero: ");
        double num2 = scanner.nextDouble();

        System.out.print("Inserisci il simbolo dell'operazione aritmetica (+, -, *, /): ");
        char operazione = scanner.next().charAt(0);

        double risultato = 0;

        if (operazione == '+') {
            risultato = num1 + num2;
        } else if (operazione == '-') {
            risultato = num1 - num2;
        } else if (operazione == '*') {
            risultato = num1 * num2;
        } else if (operazione == '/') {
            risultato = num1 / num2;
        } else {
            System.out.println("Operazione non valida");
        }

        System.out.println("Il risultato è: " + risultato);
    }
}

