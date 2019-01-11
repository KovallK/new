package pl.sda.javastart.homeWork2;

public class TankInstance {
    public static void main(String[] args) {
        Tank tankInstance = new Tank();
        tankInstance.setName("Rudy105");
        tankInstance.setWeight(10000);
        tankInstance.setFuelTankVolume(1000);
        tankInstance.setFuelUsage(500);

        System.out.println(tankInstance);
        System.out.println("Na pozostałym w baku paliwie przejedziesz " + tankInstance.fuelRange(1190) + " km");
    }

    @Override
    public  String toString() {
        return super.toString();
    }
}
