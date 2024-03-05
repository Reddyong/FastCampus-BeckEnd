package fc.livelecture.java.day07.domain;

public class Mom extends Family {
    public Mom() {
    }

    public Mom(String city) {
        super(city);
    }

    @Override
    public void introduce() {
        System.out.println("I live in " + this.city);
    }

}
