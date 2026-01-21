package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static void main() {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Dein Name:");
        String name = sc.nextLine();

        int SpielerPunkte=0;
        int computerPunkte=0;

        boolean revanche= true;
        while(revanche) {

            System.out.println("\n Wer zuerst 3 Punkte erreicht gewinnt das Spiel!");

            while(SpielerPunkte<3 && computerPunkte<3) {

                System.out.println("Was wählst du aus? Schere, Stein oder Papier?:");
                String auswahl = sc.nextLine().toLowerCase();

                if(!auswahl.equals("Schere") && !auswahl.equals("Stein") && !auswahl.equals("Papier")) {
                    System.out.println(auswahl+" existiert nicht! Versuche es noch einmal.\n"); continue;
                }

                int computer = rand.nextInt(3);
                String computerwahl= switch (computer){
                    case 0 -> "Schere";
                    case 1 -> "Stein";
                    case 2 -> "Papier";
                    default -> "";
                }
            }

        }
    }

}
