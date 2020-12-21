package bsu.rfe.java.group7.lab1.CAI.A7;

public class Icecream extends Food {
    private String sirup;
    public Icecream(String sirup) {
        super("Icecream");
        this.sirup = sirup;
    }

    public void consume() {
        System.out.println(this + "съеден");
    }
    
    public String getSirup() {
        return sirup;
    }

    public void setSirup(String sirup) {
        this.sirup = sirup;
    }
    public String toString() {
        return super.toString() + "сироп '" + sirup.toUpperCase() + "'";

    }
}