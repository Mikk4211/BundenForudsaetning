package Mikkel;

import java.util.Scanner;

public class MineMetoder {
    static Scanner aT = new Scanner(System.in);

    // Input til hvor mange terninger (1 eller 2 terninger, preferably)
    static int terninger = aT.nextInt();


    public static int rand(int max, int min) {
        int range = (max - min) + 1;
        int random = (int) ((Math.random() * range) + min);
        return random;

    }
    }





