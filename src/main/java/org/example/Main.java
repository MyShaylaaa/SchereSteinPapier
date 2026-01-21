package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static void main() {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Dein Name:");
        String name = sc.nextLine();

        boolean revanche= true;

        while(revanche) {

            int spielerPunkte=0;
            int computerPunkte=0;
            System.out.println("\nWer zuerst 3 Punkte erreicht gewinnt das Spiel!");

            while(spielerPunkte<3 && computerPunkte<3) {

                System.out.println("Was wählst du aus? Schere, Stein oder Papier?:");
                String auswahl = sc.nextLine().toLowerCase();

                if(!auswahl.equals("schere") && !auswahl.equals("stein") && !auswahl.equals("papier")) {
                    System.out.println(auswahl+" existiert nicht! Versuche es noch einmal.\n"); continue;
                }

                int computer = rand.nextInt(3);
                String computerwahl= switch (computer){
                    case 0 -> "Schere";
                    case 1 -> "Stein";
                    case 2 -> "Papier";
                    default -> "";
                };

                System.out.println("Gegenspieler wählt: " + computerwahl);

                if (auswahl.equals(computerwahl)) {
                    System.out.println("\nUnentschieden!\n");
                }else if (auswahl.equals("papier") && computerwahl.equals("stein") ||
                        auswahl.equals("schere") && computerwahl.equals("papier") ||
                        auswahl.equals("stein") && computerwahl.equals("schere")) {

                    System.out.println("\n"+name+" gewinnt dieese Runde!\n");
                    spielerPunkte++;

                }else{
                    System.out.println("\nDer Gegenspieler gewinnt diese Runde!\n");
                    computerPunkte++;
                }

                System.out.println("Punktestand:");
                System.out.println(name+": "+spielerPunkte);
                System.out.println("Gegenspieler: "+computerPunkte);
            }

            if(spielerPunkte==3) {
                System.out.println("Glückwunsch, du hast gewonnen!");

            }else if(computerPunkte==3) {
                System.out.println("Schade, du hast verloren :(");
            }

            System.out.println("Lust auf eine revanche?");
            String antwort=sc.nextLine().toLowerCase();

            if(!antwort.equals("ja")){
                revanche=false;

                System.out.println("Bis zum nächsten mal!");
            }

        }
        sc.close();
    }

}
