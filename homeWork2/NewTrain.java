package pl.sda.javastart.homeWork2;

import java.util.Arrays;

public class NewTrain {
    public static void main(String[] args) {
        Train anotherTrain = new Train();
        anotherTrain.setTrainName("Fabrykant");
        anotherTrain.setTrainWeight(150000);
        anotherTrain.setNumOfPassengers(1000);
        RailwayWagon wagon = new RailwayWagon();
        RailwayWagon wagon2=new RailwayWagon();
        RailwayWagon wagon3=new RailwayWagon();
        RailwayWagon[] wagons = new RailwayWagon[]{wagon,wagon2,wagon3};
        wagon.setWagonClass(1);
        wagon.setWagonWeight(1000);
        wagon.setNumberOfSeats(45);
        wagon2.setWagonClass(2);
        wagon2.setWagonWeight(1000);
        wagon2.setNumberOfSeats(60);
        wagon3.setWagonClass(3);
        wagon3.setWagonWeight(1000);
        wagon3.setNumberOfSeats(75);
        anotherTrain.setWagons(wagons);


        System.out.println(anotherTrain);
        //anotherTrain.addOneWagon(wagon);


        }

    }

