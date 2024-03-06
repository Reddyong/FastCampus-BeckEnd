package fc.java.course1.part3;

import fc.java.course1.model.MyUtil;
import fc.java.course1.model.MyUtil1;

public class StaticAccess {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        MyUtil1 myUtil1 = new MyUtil1();
        int sum = MyUtil.hap(a, b);
        int sum1 = myUtil1.hap(a, b);

        System.out.println("sum = " + sum);
        System.out.println("sum1 = " + sum1);
    }
}
