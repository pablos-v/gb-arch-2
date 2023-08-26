package hw_1.in_memory_model;

public class Observer implements IModelChangedObserver {
    @Override
    public void applyUpdateModel() {
        System.out.println("Model changed!");
    }
}
