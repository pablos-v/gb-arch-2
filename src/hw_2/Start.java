package hw_2;

import java.util.Date;

public class Start {
    public static void main(String[] args) {
        Chopmeat chop = new Chopmeat(100, new Date(System.currentTimeMillis()));
        CutletMaker cutletMaker = new CutletMaker(chop);
        System.out.println(cutletMaker.makeCutlet());

        Meat meat = new Meat(33, new Date(System.currentTimeMillis()));
        Chopmeat adapter = new MeatToChopAdapter(meat);
        cutletMaker.setChop(adapter);
        System.out.println(cutletMaker.makeCutlet());

    }
}
