package hw_3;

import java.awt.*;

public class Harvester extends Car implements Fueling, Wiping {


    public Harvester(String make, String model, Color color) {
        super(make, model, color);
        setWheelsCount(6);
    }

    public void setRefuelingStation(Refueling refuelingStation) {
        this.refueling = refuelingStation;
    }

    public void setWipingStation(CleanOperations wipingStation) {
        this.wipStation = wipingStation;
    }

    /**
     * Заправить автомобиль
     */
    @Override
    public void fuel() {
        if (refueling != null) {
            refueling.fuel(fuelType);
        }
    }

    @Override
    public void movement() {

    }

    @Override
    public void maintenance() {

    }

    @Override
    public boolean gearShifting() {
        return false;
    }

    @Override
    public boolean switchHeadlights() {
        return false;
    }

    @Override
    public boolean switchWipers() {
        return false;
    }


    @Override
    public void wipMirrors() {
        wipStation.wipMirrors();
        System.out.println("mirrors cleaned");
    }

    @Override
    public void wipWindshield() {
        wipStation.wipWindshield();
        System.out.println("Windshield cleaned");
    }

    @Override
    public void wipHeadlights() {
        wipStation.wipHeadlights();
        System.out.println("Headlights cleaned");
    }

    @Override
    public void wipExterior() {
        wipStation.wipExterior();
        System.out.println("All the car cleaned");
    }


}
