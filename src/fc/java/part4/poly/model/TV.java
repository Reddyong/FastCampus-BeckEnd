package fc.java.part4.poly.model;

public class TV extends RemoCon {

    @Override
    public void chUp() {
        System.out.println("tv channel up");
    }

    @Override
    public void chDown() {
        System.out.println("tv channel down");
    }

    @Override
    public void volUp() {
        System.out.println("tv volume up");
    }

    @Override
    public void volDown() {
        System.out.println("tv volume donw");
    }
}
