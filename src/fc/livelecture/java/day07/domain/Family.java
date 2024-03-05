package fc.livelecture.java.day07.domain;

public class Family {
    protected String city;

    public void introduce() {
    }

    public void move(String city){
        this.city = city;
    }

    public Family() {
    }

    public Family(String city) {
        this.city = city;
    }
}
