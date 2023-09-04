package hw_3;

import java.awt.*;

public class Program {

    /**
     * Продемонстрировать работу получившейся программы, создать несколько типов
     * автомобилей, загнать каждый автомобиль на заправку, а затем и на автомойку.
     *
     * @param args
     */
    public static void main(String[] args) {


        Harvester harvester = new Harvester("A", "B", Color.BLACK);
        harvester.fuelType = FuelType.Diesel;

        FlyCar flyCar = new FlyCar("Boeing", "737", Color.RED);
        flyCar.fuelType = FuelType.Gasoline;

        WipingStation wipingStation = new WipingStation();
        WipingStationV2 wipingStationV2 = new WipingStationV2();
        RefuelingStation refuelingStation = new RefuelingStation();
        RefuelingStationV2 refuelingStationV2 = new RefuelingStationV2();

        harvester.setRefuelingStation(refuelingStation);
        harvester.fuel();
        harvester.setWipingStation(wipingStation);
        harvester.wipExterior();
        System.out.println("--------");

        harvester.setRefuelingStation(refuelingStationV2);
        harvester.fuel();
        harvester.setWipingStation(wipingStationV2);
        harvester.wipHeadlights();
        System.out.println("--------");

        flyCar.setRefuelingStation(refuelingStationV2);
        flyCar.fuel();
        flyCar.setWipingStation(wipingStationV2);
        flyCar.wipWindshield();

    }

}
