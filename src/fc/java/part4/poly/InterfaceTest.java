package fc.java.part4.poly;

import fc.java.part4.poly.model.Radio;
import fc.java.part4.poly.model.RemoCon;
import fc.java.part4.poly.model.TV;

public class InterfaceTest {
    public static void main(String[] args) {
        RemoCon radioRemo = new Radio();
        RemoCon tvRemo = new TV();

        radioRemo.chUp();
        radioRemo.chDown();
        radioRemo.volUp();
        radioRemo.volDown();

        tvRemo.chUp();
        tvRemo.chDown();
        tvRemo.volUp();
        tvRemo.volDown();

        radioRemo.internet();
        tvRemo.internet();
    }
}
