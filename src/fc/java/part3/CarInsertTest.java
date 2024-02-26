package fc.java.part3;

import fc.java.model.CarDAO;
import fc.java.model.CarDTO;

import java.util.Scanner;

public class CarInsertTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CarDTO car = new CarDTO();
        CarDAO carDAO = new CarDAO();

        car.setCarSn(scanner.nextInt());
        car.setCarName(scanner.next());
        car.setCarPrice(scanner.nextInt());
        car.setCarOwner(scanner.next());
        car.setCarYear(scanner.nextInt());
        car.setCarType(scanner.next());

        carDAO.carInsert(car);
        carDAO.carSelect(car.getCarSn());
    }
}
