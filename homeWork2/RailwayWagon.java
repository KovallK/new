package pl.sda.javastart.homeWork2;

import java.util.Arrays;

public class RailwayWagon {

    public static void main(String[] args) {

    }
    private int wagonWeight;
    private int wagonClass;
    private int numberOfSeats;
    private boolean foodAvailability;


    public int getWagonWeight() {
        return wagonWeight;
    }

    public void setWagonWeight(int wagonWeight) {
        this.wagonWeight = wagonWeight;
    }

    public int getWagonClass() {
        return wagonClass;
    }

    public void setWagonClass(int wagonClass) {
        this.wagonClass = wagonClass;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public boolean isFoodAvailability() {
        return foodAvailability;
    }
    public void setFoodAvailability(boolean foodAvailability) {
        this.foodAvailability = foodAvailability;
    }

    @Override
    public String toString() {
       return "To jest wagon klasy " + wagonClass + ", o masie " + wagonWeight +
                "kg, o liczbie pasażerów " + numberOfSeats + ", gdzie jedzenie jest " + foodAvailability;
    }
}
