package fc.java.part4.poly.model;

public class TV implements RemoCon {
    private int curChannel = 10;

    @Override
    public void chUp() {
        curChannel++;
        if (curChannel > RemoCon.MAX_CH) {
            curChannel = 1;
        }
        System.out.println("tv channel up");
    }

    @Override
    public void chDown() {
        curChannel--;
        if (curChannel < RemoCon.MIN_CH) {
            curChannel = 99;
        }
        System.out.println("tv channel down");
    }

    @Override
    public void volUp() {
        System.out.println("tv volume up");
    }

    @Override
    public void volDown() {
        System.out.println("tv volume down");
    }

    @Override
    public void internet() {
        System.out.println("tv internet is possible");
    }
}
