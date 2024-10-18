package edu.avogadro;



import java.util.Scanner;

public class VetrallaTPSI {


    public static void main(String[] args) {
        Scanner leggi = new Scanner(System.in);
        System.out.println("Il numero è: " + leggiIntero(leggi));
    }


    public static int leggiIntero(Scanner leggi) {

        while (true) {
            try {
                Exception err = new Exception("Il numero non è compreso nei limiti");
                System.out.println("Inserisci il limite minimo");
                String min = leggi.nextLine();
                int minore = Integer.parseInt(min);
                System.out.println("Inserisci il limite massimo");
                String max = leggi.nextLine();
                int maggiore = Integer.parseInt(max);
                while (true) {
                    try {
                        if (maggiore < minore) {
                            throw err;
                        }
                    } catch (Exception e) {
                        throw new NumberFormatException("Il limite maggiore non può essere minore del limite minore");
                    }

                    System.out.println("Inserisci il numero");
                    String num = leggi.nextLine();
                    int numero = Integer.parseInt(num);
                    if (numero < minore || numero > maggiore) {
                        throw err;
                    } else {
                        return numero;
                    }
                }
            } catch (NumberFormatException e){
                System.out.println("Hai inserito un carattere diverso da un numero");
                leggi.nextLine();
            }
            catch (Exception err) {
                System.out.println(err);
                leggi.nextLine();
            }
        }
    }
}