package hw_2;

public class CutletMaker {
    private Chopmeat chop;

    public Chopmeat getChop() {
        return chop;
    }

    public void setChop(Chopmeat chop) {
        this.chop = chop;
    }

    public CutletMaker(Chopmeat chop) {
        this.chop = chop;
    }

    public Cutlet makeCutlet() {
        return new Cutlet(this.chop);
    }
}
