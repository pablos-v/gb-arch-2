package hw_3;

import java.awt.*;

public class FlyCar extends Car implements Fueling, Wiping {
    public FlyCar(String make, String model, Color color) {
        super(make, model, color);
        setWheelsCount(4);
    }

    public void fly() {
        System.out.println("Автомобиль летит!");
    }

    @Override
    public void movement() {
        fly();
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
    public void fuel() {
        refueling.fuel(fuelType);
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

    public void setRefuelingStation(Refueling refuelingStation) {
        this.refueling = refuelingStation;
    }

    public void setWipingStation(CleanOperations wipingStation) {
        this.wipStation = wipingStation;
    }
}
