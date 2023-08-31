package hw_2;


public class MeatToChopAdapter extends Chopmeat {

    public MeatToChopAdapter(Meat meat) {
        super(meat.getWeight(), meat.getManufactured());
    }
}

