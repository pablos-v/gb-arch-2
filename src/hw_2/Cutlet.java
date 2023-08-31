package hw_2;

import java.util.Date;

public class Cutlet {
    private int weight;
    private Date manufactured;
    private Chopmeat chop;

    public Cutlet(Chopmeat chop) {
        this.chop = chop;
        this.manufactured = new Date(System.currentTimeMillis());
        this.weight = chop.getWeight();
    }

    @Override
    public String toString() {
        return "Я вкусная котлетка весом " + weight + " кило" +
                ", я сделана " + manufactured.getDate() + " числа.";
    }
}
