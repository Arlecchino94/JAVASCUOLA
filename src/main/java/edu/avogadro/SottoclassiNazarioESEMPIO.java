package edu.avogadro;

import java.util.Scanner;

public class SottoclassiNazarioESEMPIO {

    /*
    Classe: Autoveicolo


    Sottoclassi: Auto, Moto, Pullman
     */

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            Auto auto = new Auto(scan.nextLine(), scan.nextLine(), scan.nextInt(), scan.nextInt());
            Moto moto = new Moto("Yamaha", "MT-07", 2020, true);
            Pullman pullman = new Pullman("Mercedes", "Sprinter", 2019, 15);

            // Richiamo dei metodi
            System.out.println("Auto:");
            System.out.println("Marca: " + auto.getMarca());
            System.out.println("Modello: " + auto.getModello());
            System.out.println("Anno: " + auto.getAnno());
            System.out.println("Numero di porte: " + auto.getNumPorte());
            auto.start();
            auto.stop();

            System.out.println("\nMoto:");
            System.out.println("Marca: " + moto.getMarca());
            System.out.println("Modello: " + moto.getModello());
            System.out.println("Anno: " + moto.getAnno());
            System.out.println("Ha carrello: " + moto.getHaCarrello());
            moto.start();
            moto.stop();

            System.out.println("\nPullman:");
            System.out.println("Marca: " + pullman.getMarca());
            System.out.println("Modello: " + pullman.getModello());
            System.out.println("Anno: " + pullman.getAnno());
            System.out.println("Numero di posti: " + pullman.getNumPosti());
            pullman.start();
            pullman.stop();
        }
    }

    class Autoveicolo {
        private String marca;
        private String modello;
        private int anno;

        public Autoveicolo(String marca, String modello, int anno) {
            this.marca = marca;
            this.modello = modello;
            this.anno = anno;
        }

        // Metodi comuni
        public String getMarca() {
            return marca;
        }

        public String getModello() {
            return modello;
        }

        public int getAnno() {
            return anno;
        }

        public void start() {
            System.out.println("L'autoveicolo è in partenza.");
        }

        public void stop() {
            System.out.println("L'autoveicolo si è fermato.");
        }
    }

    // Sottoclasse Auto
    class Auto extends Autoveicolo {
        private int numPorte;

        public Auto(String marca, String modello, int anno, int numPorte) {
            super(marca, modello, anno);
            this.numPorte = numPorte;
        }

        public int getNumPorte() {
            return numPorte;
        }

        @Override
        public void start() {
            System.out.println("L'auto è in partenza.");
        }
    }

    // Sottoclasse Moto
        class Moto extends Autoveicolo {
        private boolean haCarrello;

        public Moto(String marca, String modello, int anno, boolean haCarrello) {
            super(marca, modello, anno);
            this.haCarrello = haCarrello;
        }

        public boolean getHaCarrello() {
            return haCarrello;
        }

        @Override
        public void start() {
            System.out.println("La moto è in partenza.");
        }
    }

    // Sottoclasse Pullman
    class Pullman extends Autoveicolo {
        private int numPosti;

        public Pullman(String marca, String modello, int anno, int numPosti) {
            super(marca, modello, anno);
            this.numPosti = numPosti;
        }

        public int getNumPosti() {
            return numPosti;
        }

        @Override
        public void start() {
            System.out.println("Il pullman è in partenza.");
        }
    }

