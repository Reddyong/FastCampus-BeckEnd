package fc.java.part3;

import fc.java.model.CarDTO;
import fc.java.model.CarUtility;

public class CarUtilityTest {
    public static void main(String[] args) {
        CarDTO car = new CarDTO(1111, "BMW520D", 85000000, "Hong", 2020, "G");
        CarUtility carUtility = new CarUtility();

        carUtility.carPrint(car);
    }
}
