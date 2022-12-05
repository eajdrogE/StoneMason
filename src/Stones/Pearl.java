package Stones;



public final class Pearl extends Stone {
    private static final String color = "white";
    public String getColor() {

        return color;
    }
    public void setColor(String color) {

        this.color = color;
    }
    public Pearl() {
        super();
        Pearl.value = 800;
        Pearl.precious = 0;
        Pearl.weightOfStone = 4.5;
        Pearl.clarityOfStone = 0;
        Pearl.typeOfStone = "Pearl";
    }
}