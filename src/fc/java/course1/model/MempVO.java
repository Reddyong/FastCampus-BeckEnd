package fc.java.course1.model;

import fc.java.course1.part4.Employee;

public class MempVO extends Employee {
    private String mdept;

    public MempVO() {
    }

    public MempVO(String mdept) {
        this.mdept = mdept;
    }

    public MempVO(String name, int age, String phoneNumber, String empDate, String dept, String marriage, String mdept) {
//        super(name, age, phoneNumber, empDate, dept, marriage);
        this.mdept = mdept;
    }



}
