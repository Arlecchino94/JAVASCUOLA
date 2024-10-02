package edu.avogadro;


import java.util.InputMismatchException;
import java.util.Scanner;

public class VetrallaTPSI {


    public static void main(String[] args) {
        Scanner leggi = new Scanner(System.in);
        System.out.println("Il numero è: "+leggiIntero(leggi));
    }




    public static int leggiIntero(Scanner leggi) {

        while (true) {
                try {
                    Exception err = new Exception("Il numero non è compreso nei limiti");
                    System.out.println("Inserisci il limite minimo");
                    int min = leggi.nextInt();
                    System.out.println("Inserisci il limite massimo");
                    int max = leggi.nextInt();
                    System.out.println("Inserisci il numero");
                    int num = leggi.nextInt();
                    if (num < min || num > max) {
                        throw err;
                    } else {
                        return num;
                    }
                }
            catch (Exception err){
                System.out.println(err);
                leggi.nextLine();
            }
        }
    }
}