

public abstract class Stone implements Comparable<Stone>{

    protected  int value;
    protected static boolean precious;

    protected static double weightOfStone;//in carat

    protected static int clarityOfStone;

    protected static String typeOfStone;
    @Override
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public String getPrecious() {
       if (precious) return "precious";
       else return "semiprecious";
    }
    public void setPrecious(int value) {
        this.value = value;
    }
    public double getWeight() {
        return weightOfStone;
    }
    public void setWeight(double weightOfStone) {
        this.weightOfStone = weightOfStone;
    }
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }

    public String toString() {
        return "Stone{" +
                "type = " + Stone.getTypeOfStone() +
                " precious = " + Stone.getPrecious() +
                " weight = " + Stone.getWeightOfStone() +
                " clarity = " + Stone.getClarityOfStone() +
                " rangeOfFlight = " + Stone.getValue() +'}';
    }

    public int compareTo(Stone stone){
        return Stone.rangeOfFlight - Stone.getRangeOfFlight();
    }
    public Stone(){}
}
