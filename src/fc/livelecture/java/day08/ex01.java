package fc.livelecture.java.day08;

import fc.livelecture.java.day08.domain.*;

public class ex01 {
    public static void main(String[] args) {
        Movie spiderMan = new SpiderMan();
        Movie ironMan = new IronMan();

        spiderMan.printInfo();
        ironMan.printInfo();

        Parent child = new Child();
        child.method();
    }
}
