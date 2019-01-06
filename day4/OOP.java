package pl.sda.javastart.day4;

import java.math.BigDecimal;

public class OOP {
    public static void main(String[] args) {
        Car car =new Car();
        car.setModel("Fabia");
        System.out.println(car.getModel());
        System.out.println(car);

       CarOption leatherSeats = new CarOption();
       leatherSeats.setOptionName("skóra");
       leatherSeats.setChoosen(true);
       leatherSeats.setOptionPrice(BigDecimal.valueOf(9.99));

       CarOption radio =new CarOption();
       radio.setOptionName("Radio");
       radio.setChoosen(true);
       radio.setOptionPrice(BigDecimal.valueOf(19.99));

      CarOption[] options = new CarOption[]{radio,leatherSeats};
      car.setOptions(options);
      car.setBasePrice(BigDecimal.valueOf(100.00));
        System.out.println(totalPrice(car));//przez wywolanie metody z biezacej klasy tj.OOP
        System.out.println(car.totalPrice());//przez wywolanie metody w klasie Car
        System.out.println(car.toString());


    }
    private static BigDecimal totalPrice (Car car){
        BigDecimal result = car.getBasePrice();
        CarOption[] carOptions = car.getOptions();
        for(int i =0;i<carOptions.length;i++){
           result= result.add(carOptions[i].getOptionPrice());
        }
        return result;

    }


}
