package Stones;



public final class Amber extends Stone {
    private static final int age = 1300; //in thousands
    public int getAge() {

        return age;
    }
    public void setAge(int age) {

        this.age = age;
    }
    public Amber() {
        super();
        Pearl.value = 900;
        Pearl.precious = 0;
        Pearl.weightOfStone = 6;
        Pearl.clarityOfStone = 0.5;
        Pearl.typeOfStone = "Amber";
    }
