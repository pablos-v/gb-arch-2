package hw_3;

public class WipingStationV2 implements CleanOperations{

    @Override
    public void wipMirrors() {
        System.out.println("Extremal wiping of mirrors started");
    }

    @Override
    public void wipWindshield() {
        System.out.println("wiping of Windshield with soap and tits started");
    }

    @Override
    public void wipHeadlights() {
        System.out.println("Extremal wiping of Headlights started");
    }

    @Override
    public void wipExterior() {
        System.out.println("Full exterior hand-wiping started");
    }
}
