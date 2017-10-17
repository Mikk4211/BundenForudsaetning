package Mikkel;

public class DatHoldet {
    // Her har jeg deklareret at der er 4 studerende på holdet, givet ved navn.
    String navn;
    int alder;

    static Studerende stu1 = new Studerende("Mikkel", 20);
    static Studerende stu2 = new Studerende("Johan", 20);
    static Studerende stu3 = new Studerende("Mathias", 20);
    static Studerende stu4 = new Studerende("Benjamin", 23);

    public String setNavn(){
        return navn;
    }
    public String getNavn(){
        return navn;
    }
    public int setAlder(){
        return alder;
    }
    public int getAlder(){
        return alder;
    }


}