package hw_3;

public class RefuelingStationV2 implements Refueling {
    @Override
    public void fuel(FuelType fuelType) {
        switch (fuelType){
            case Diesel -> System.out.println("Заправка зимним дизельным топливом");
            case Gasoline -> System.out.println("Заправка высокооктановым бензином");
        }
    }
}