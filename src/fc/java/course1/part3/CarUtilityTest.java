package fc.java.course1.part3;

import fc.java.course1.model.CarDTO;
import fc.java.course1.model.CarUtility;

public class CarUtilityTest {
    public static void main(String[] args) {
        CarDTO car = new CarDTO(1111, "BMW520D", 85000000, "Hong", 2020, "G");
        CarUtility carUtility = new CarUtility();

        carUtility.carPrint(car);
    }
}
