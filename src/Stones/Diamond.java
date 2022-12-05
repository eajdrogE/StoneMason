package Stones;



public final class Diamond extends Stone {
    private static final String cutting = "Point Cut";
    public String getCutting() {

        return cutting;
    }
    public void setCutting(String cutting) {

        this.cutting = cutting;
    }
    public Diamond() {
        super();
        Pearl.value = 8000;
        Pearl.precious = 1;
        Pearl.weightOfStone = 1.5;
        Pearl.clarityOfStone = 1;
        Pearl.typeOfStone = "Diamond";
    }
