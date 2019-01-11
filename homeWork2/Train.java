package pl.sda.javastart.homeWork2;

import java.util.Arrays;

public class Train {
    public static void main(String[] args) {

    }
    private RailwayWagon[] wagons;
    private int trainWeight;
    private String trainName;
    private int numOfPassengers;
    private int numOFCarriages;

    public int getTrainWeight() {
        return trainWeight;

    }

    public void setTrainWeight(int trainWeight) {
        this.trainWeight = trainWeight;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public int getNumOfPassengers() {
        return numOfPassengers;
    }

    public void setNumOfPassengers(int numOfPassengers) {
        this.numOfPassengers = numOfPassengers;
    }

    public int getNumOFCarriages() {
        return numOFCarriages;
    }

    public void setNumOFCarriages(int numOFCarriages) {
        this.numOFCarriages = numOFCarriages;
    }

    @Override
    public String toString() {
        return numOFCarriages + " " + numOfPassengers + Arrays.toString(wagons);
    }

    public RailwayWagon[] getWagons() {
        return wagons;
    }

    public void setWagons(RailwayWagon[] wagons) {
        this.wagons = wagons;
    }/* public void addOneWagon(RailwayWagon wagons){
       /*or(int i =0;i<wagons.length;i++){
            RailwayWagon[] newwagons = new RailwayWagon[wagons.length+1];
            wagons=newwagons;
        }
    }

    }
*/
}