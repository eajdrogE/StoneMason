package Stones;

public abstract class Stone implements Comparable<Stone>{

   private   int value;
    private  boolean precious;
    private  double weightOfStone;//in carat
    private  int clarityOfStone;

    private  String typeOfStone;


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
    public void setPrecious(boolean precious) {
        this.precious = precious;
    }
    public double getWeightOfStone() {
        return weightOfStone;
    }
    public void setWeight(double weightOfStone) {
        this.weightOfStone = weightOfStone;
    }
    public int getClarityOfStone() {
        return clarityOfStone;
    }
    public void setClarity (int clarityOfStone) {
        this.clarityOfStone = clarityOfStone;
    }
    public String getTypeOfStone() {
        return typeOfStone;
    }
    public void setTypeStone(String typeOfStone) {
        this.typeOfStone = typeOfStone;
    }
    public String toString() {
        return "Stone{" +
                "type = " + Stone.getTypeOfStone() +
                " precious = " + Stone.getPrecious() +
                " weight = " + Stone.getWeightOfStone() +
                " clarity = " + Stone.getClarityOfStone() +
                " rangeOfFlight = " + Stone.getValue() +'}';
    }

    //public int compareTo(Stone stone){
  //      return Stone.clarityOfStone - Stone.getClarityOfStone();
 //   }
    public Stone(){}
}
