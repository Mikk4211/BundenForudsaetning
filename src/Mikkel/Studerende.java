package Mikkel;

public class Studerende {
    int alder;
    String navn;
    // Denne klasse skal beskrive de studerende, herunder deres alder, deres navn og deres køn.

    // Constructor
    Studerende(String navn, int alder) {
        this.alder = alder;
        this.navn = navn;
    }

    public void syg(){
        System.out.println(navn + " er desværre syg idag.");
    }


}
