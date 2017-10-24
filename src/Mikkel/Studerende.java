package Mikkel;

public class Studerende {
    int alder;
    String navn;
    /*boolean syg;*/
    // Denne klasse skal beskrive de studerende, herunder deres alder, deres navn og deres køn.

    // Constructor
    Studerende(String navn, int alder) {
        this.alder = alder;
        this.navn = navn;
    }
    /*public void setSyg { this.syg = syg; }
    public boolean getSyg() {return syg; } */
    // Det bliver ikke umiddelbart brugt, da der ikke er nogen elever der er syge.

}
