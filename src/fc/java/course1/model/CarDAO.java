package fc.java.course1.model;

public class CarDAO {
    // CRUD
    // Create = insert
    public void carInsert(CarDTO car) {
        System.out.println("car Info saved at DB");
    }

    // Read = select
    public void carSelect(int carId) {
        System.out.println("car Info selected from DB");
    }
}
