package Mikkel;

import static Mikkel.DatHoldet.*;
import static Mikkel.MineMetoder.*;
import static Mikkel.DatHoldet.*;

public class Start {
    public static void main(String[] args) {

        // Navneopråbning, der viser om de studerende er til stede.
        // Mathias er som default sat som fraværende, fordi det gør programmet mere realistisk.
        System.out.println("Navneopråbning: ");
        System.out.println(stu1.navn + " er her.");
        System.out.println(stu2.navn + " er her.");
        System.out.println(stu3.navn + " er her ikke.");
        System.out.println(stu4.navn + " er her.");

        System.out.println("Eleverne spiller terningespil. ");
        System.out.println("Hold 1 som er " + stu1.navn + " og " + stu3.navn + " vinder hvis det bliver et ulige tal");
        System.out.println("Hold 2 som er " + stu2.navn + " og " + stu4.navn + " vinder hvis det bliver et lige tal.");


        // Terningespil, hvor man indtaster 1 eller 2 terninger.
        System.out.println("Indtast mængden af terninger: ");
        int terninger = aT.nextInt();                   // Her er det primære problem. Jeg vil gerne have et input (1 eller 2)
        if (terninger == 2){                            // til at være en bestemmende faktor for mit random statement.
            System.out.println(rand(12,2));     // Men hvis jeg gør det på den måde her, vil den bede om max og min, og det skaber et problem i programmet. 
        }                                               // Af en eller anden grund, skal man taste antallet af terninger
        else                                            // ind 2 gange før der kommer noget ud, jeg ved ikke hvorfor.
        {
            System.out.println(rand(6,1));
        }



        }

        }




