package bsu.rfe.java.group7.lab1.CAI.A7;

public class Icecream extends Food {

    private String syrup;

    public String getSyrup() {
        return syrup;
    }

    public void setSyrup() {
        this. syrup = syrup;
    }

    public Icecream(String syrup) {
        super("Icecream");
        this.syrup = syrup;
    }

    public void consume() {
        System.out.println(this + "съеден");
    }

    public String toString() {
        return super.toString() + " with '" + syrup.toUpperCase() + "'";

    }
}