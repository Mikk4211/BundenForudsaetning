package Mikkel;

import java.util.Random;
import java.util.Scanner;

import static Mikkel.DatHoldet.*;
import static Mikkel.MineMetoder.*;
import static Mikkel.DatHoldet.*;

public class Start {
    public static void main(String[] args) {

        // Navneopråbning, der viser om de studerende er til stede.
        // Mathias er som default sat som fraværende, fordi det gør programmet mere realistisk.
        System.out.println("Navneopråbning: ");
        System.out.println(stu1.navn + " som er " + stu1.alder + " år gammel, er her.");
        System.out.println(stu2.navn + " som er " + stu2.alder + " år gammel, er her.");
        System.out.println(stu3.navn + " som er " + stu3.alder + " år gammel, er her ikke.");
        System.out.println(stu4.navn + " som er " + stu4.alder + " år gammel, er her.");

        //Beskrivelse af aktivitet i printlines.
        System.out.println("Eleverne spiller terningespil. ");
        System.out.println("Hold 1 som er " + stu1.navn + " og " + stu3.navn + " vinder hvis det bliver et ulige tal");
        System.out.println("Hold 2 som er " + stu2.navn + " og " + stu4.navn + " vinder hvis det bliver et lige tal.");


        // Terningespil, hvor man indtaster 1 eller 2 terninger.
        System.out.println("Indtast mængden af terninger: ");
        Scanner s = new Scanner(System.in);
        int terninger = s.nextInt();
        //While loop, der gør at brugeren skal indtaste et nyt tal, hvis de indtaster over 2.
        while ((terninger != 1) && (terninger != 2)) {
            terninger = s.nextInt();                   // Her er det primære problem. Jeg vil gerne have et input (1 eller 2)
            if ((terninger != 1) && (terninger != 2)) {
                System.out.println("Indtast 1 eller 2");
            }
        }
            // Hvis antal terninger er 2, skal max værdi være 12, og min værdi være 2.
            if (terninger == 2) {
                int vinderTal = rand(12, 2);
                hvemVinder(vinderTal);
            }
            // Hvis antal terninger er 1, skal max værid være 6 og min værdi være 1.
            if (terninger == 1) {
                int vinderTal = rand(6, 1);
                hvemVinder(vinderTal);
            }
        }
    // Denne funktion trækker en vinder
    private static void hvemVinder ( int tal){
        int vinderTal = tal % 2;                    // % = Mod, som giver en rest. Hvis tallet har en rest med 0, vinder hold 2.
        if (vinderTal == 0) {
            System.out.println("Hold 2 vinder med tallet " + tal);
        }
        // Hvis der bliver valgt 1 terning, bliver den højeste værdi da 6, og den laveste 1.
        if (vinderTal == 1)
        {
            System.out.println("Hold 1 vinder med tallet " + tal);
        }
    }
}