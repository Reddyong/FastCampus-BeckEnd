package fc.java.course1.model;

public class CarDTO {
    private int carSn;
    private String carName;
    private int carPrice;
    private String carOwner;
    private int carYear;
    private String carType;

    public CarDTO() {
    }

    public CarDTO(int carSn, String carName, int carPrice, String carOwner, int carYear, String carType) {
        this.carSn = carSn;
        this.carName = carName;
        this.carPrice = carPrice;
        this.carOwner = carOwner;
        this.carYear = carYear;
        this.carType = carType;
    }

    public int getCarSn() {
        return carSn;
    }

    public String getCarName() {
        return carName;
    }

    public int getCarPrice() {
        return carPrice;
    }

    public String getCarOwner() {
        return carOwner;
    }

    public int getCarYear() {
        return carYear;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarSn(int carSn) {
        this.carSn = carSn;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public void setCarPrice(int carPrice) {
        this.carPrice = carPrice;
    }

    public void setCarOwner(String carOwner) {
        this.carOwner = carOwner;
    }

    public void setCarYear(int carYear) {
        this.carYear = carYear;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    @Override
    public String toString() {
        return "CarDTO{" +
                "carSn=" + carSn +
                ", carName='" + carName + '\'' +
                ", carPrice=" + carPrice +
                ", carOwner='" + carOwner + '\'' +
                ", carYear=" + carYear +
                ", carType='" + carType + '\'' +
                '}';
    }
}
