package fc.java.part3;

import fc.java.model.CarDTO;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CarDTO car = new CarDTO();

        car.setCarSn(scanner.nextInt());
        car.setCarName(scanner.next());
        car.setCarPrice(scanner.nextInt());
        car.setCarOwner(scanner.next());
        car.setCarYear(scanner.nextInt());
        car.setCarType(scanner.next());

        printCarInfoByVariable(car.getCarSn(), car.getCarName(), car.getCarPrice(), car.getCarOwner(), car.getCarYear(), car.getCarType());
        printCarInfoByDto(car);

    }

    private static void printCarInfoByDto(CarDTO carDTO) {
        System.out.println("Print By Dto");
        System.out.println("carDTO = " + carDTO);
    }

    private static void printCarInfoByVariable(int carSn, String carName, int carPrice, String carOwner, int carYear, String carType) {
        System.out.println("Print By Method");
        System.out.println("carSn = " + carSn);
        System.out.println("carName = " + carName);
        System.out.println("carPrice = " + carPrice);
        System.out.println("carOwner = " + carOwner);
        System.out.println("carYear = " + carYear);
        System.out.println("carType = " + carType);
    }
}
