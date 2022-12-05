package interfaces;
package org.StoneMason.interfaces;


import Stones.Amber;
import Stones.Diamond;
import Stones.Pearl;
import org.StoneMason.Stones.Pearl;
import org.StoneMason.Stones.Diamond;
import org.StoneMason.Stones.Amber;

import java.util.HashSet;

import static java.lang.Math.abs;
import static java.lang.Math.min;

public final class Necklace implements CompanyManipulating {

    private  String theName;

    private int amountOfDiamond = 0;

    private int amountOfAmber = 0;

    private int amountOfPearl = 0;
    private HashSet<Stone> stonesInNecklace = new HashSet<>();

    public Necklace(int amountOfDiamond, int amountOfAmber, int amountOfPearl, String theName) {
        this.amountOfDiamond = amountOfDiamond;
        this.amountOfAmber = amountOfAmber;
        this.amountOfPearl = amountOfPearl;
        if (amountOfDiamond != 0) {
            this.stonesInNecklace.add(new Diamond());
        }
        if (amountOfAmber != 0) {
            this.stonesInNecklace.add(new Amber());
        }
        if (amountOfPearl != 0) {
            this.stonesInNecklace.add(new Pearl());
        }
        this.theName = theName;
    }

    public void addStone(Stone stone) {
        switch (Stone.getTypeOfStone()) {
            case "Diamond" -> this.amountOfDiamond++;
            case "Amber" -> this.amountOfAmber++;
            case "Pearl" -> this.amountOfPearl++;
            default -> System.out.println("Ошибка");
        }
        stonesInNecklace.add(stone);
    }

    @Override
    public int countTotalSeats() {
        return this.getAmountOfTy134() * 80 + this.getAmountOfTy154() * 155 +
                this.getAmountOfTy204() * 200;
    }

    @Override
    public int countTotalWeight() {
        return this.amountOfDiamond * Diamond.getWeightOfStone() + this.amountOfAmber * Amber.getWeightOfStone() + this.amountOfPearl * Pearl.getWeightOfStone();
    }

    @Override
    public Stone findStoneClarity(int clarityOfStone) {
        int subDiamondClarity = Diamond.getClarityOfStone();
        int subAmberClarity = Amber.getClarityOfStone();
        int subPearlClarity = Pearl.getClarityOfStone();
        int minDiffer = min(subDiamondClarity,min(subAmberClarity,subPearlClarity));
        if (this.amountOfDiamond != 0 && subDiamondClarity == minDiffer){
            this.amountOfDiamond--;
            return new Diamond();
        }
        if (this.amountOfAmber != 0 && subAmberClarity == minDiffer){
            this.amountOfAmber--;
            return new Amber();
        }
        if (this.amountOfPearl != 0 && subPearlClarity == minDiffer){
            this.amountOfPearl--;
            return new Pearl();
        }
        return null;
    }
}
public interface StoneSearch {
}
