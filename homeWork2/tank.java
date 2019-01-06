package pl.sda.javastart.homeWork2;

public class tank {

    tank tankExemplar = new tank();

    
    private int tankWeight;
    private String name;
    private int fuelTankVolume;
    private double fuelUsage;


    public String getName() {
        return name;


    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFuelTankVolume() {
        return fuelTankVolume;
    }

    public void setFuelTankVolume(int fuelTankVolume) {
        this.fuelTankVolume = fuelTankVolume;
    }

    public double getFuelUsage() {
        return fuelUsage;
    }

    public void setFuelUsage(double fuelUsage) {
        this.fuelUsage = fuelUsage;
    }

    public int getkWeight(int tankWeight) {
        return tankWeight;
    }

    public void setWeight(int tankWeight) {
        this.tankWeight = tankWeight;
    }
    public String toString(){
        return "Jestem czołgiem o masie "+tankWeight+ ", nazwie "+name+"oraz spalam "+fuelUsage+"na 100 km";
    }


}
