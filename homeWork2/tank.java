package pl.sda.javastart.homeWork2;

public class tank {
    public static void main(String[] args) {

        tank tankExemplar = new tank();

        tankExemplar.setWeight(5000);
        tankExemplar.setName("Rudy 102");
        tankExemplar.setFuelTankVolume(1160);
        tankExemplar.setFuelUsage(790);
        System.out.println(tankExemplar);
        System.out.println("Na pozostałym w baku paliwie przejedziesz " + tankExemplar.fuelRange(1190) + " km");
        tank tankExemplarNew = new tank();
        tankExemplarNew.setWeight(10000);
        tankExemplarNew.setName("Rudy 103");
        tankExemplarNew.setFuelTankVolume(1500);
        tankExemplarNew.setFuelUsage(600);
        System.out.println(tankExemplarNew);
        System.out.println("Na pozostałym w baku paliwie przejedziesz " + tankExemplarNew.fuelRange(1190) + " km");
    }

    private int tankWeight;
    private String name;
    private int fuelTankVolume;
    private int fuelUsage;

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

    public void setFuelUsage(int fuelUsage) {
        this.fuelUsage = fuelUsage;
    }

    public int getkWeight(int tankWeight) {
        return tankWeight;
    }

    public void setWeight(int tankWeight) {
        this.tankWeight = tankWeight;
    }

    @Override
    public String toString() {
        return "Jestem czołgiem o masie " +
                +tankWeight + "kg " +
                ", nazwie " + name +
                ",oraz spalam " + fuelUsage +
                "L na 100km";
    }

    public int fuelRange(int fuelLeft) {
        return fuelLeft * 100 / fuelUsage;
    }

}
