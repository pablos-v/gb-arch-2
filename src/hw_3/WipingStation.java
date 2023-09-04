package hw_3;

public class WipingStation implements CleanOperations{

    @Override
    public void wipMirrors() {
        System.out.println("wiping of mirrors started");
    }

    @Override
    public void wipWindshield() {
        System.out.println("wiping of Windshield started");
    }

    @Override
    public void wipHeadlights() {
        System.out.println("wiping of Headlights started");
    }

    @Override
    public void wipExterior() {
        System.out.println("Full exterior wiping started");
    }
}
