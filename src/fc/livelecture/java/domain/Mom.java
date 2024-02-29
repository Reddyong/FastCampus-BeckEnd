package fc.livelecture.java.domain;

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
