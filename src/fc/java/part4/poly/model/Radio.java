package fc.java.part4.poly.model;

public class Radio extends RemoCon {

    @Override
    public void chUp() {
        System.out.println("radio channel up");
    }

    @Override
    public void chDown() {
        System.out.println("radio channel down");
    }

    @Override
    public void volUp() {
        System.out.println("radio volume up");
    }

    @Override
    public void volDown() {
        System.out.println("radio volume up");
    }
}
