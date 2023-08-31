package hw_2;

import java.util.Date;

public class Meat {
    private int weight;
    private Date manufactured;

    public Meat(int weight, Date manufactured) {
        this.weight = weight;
        this.manufactured = manufactured;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Date getManufactured() {
        return manufactured;
    }

    public void setManufactured(Date manufactured) {
        this.manufactured = manufactured;
    }
}
