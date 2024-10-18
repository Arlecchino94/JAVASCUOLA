package edu.avogadro.Nazario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Auto auto = new Auto();
        System.out.println("Modello auto?");
        String input = scan.nextLine();
        auto.setModello(input);
        System.out.println(auto.getModello());

        Moto carena = new Moto();
        System.out.println("Ha la carena?");
        input = scan.nextLine();
        carena.setCarena(input);

        Pullman pull = new Pullman();
        System.out.println("modello pullman?");
        input = scan.nextLine();
        pull.setPull(input);
        System.out.println(auto.getModello() + "\n" + carena.getCarena() + "\n" + pull.getPull());

    }
}
