package fc.java.part4;

public class Employee {
    private String name;
    private int age;
    private String phoneNumber;
    private String empDate;
    private String dept;
    private boolean marriage;

    public Employee() {
    }

    public Employee(String name, int age, String phoneNumber, String empDate, String dept, boolean marriage) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.empDate = empDate;
        this.dept = dept;
        this.marriage = marriage;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", empDate='" + empDate + '\'' +
                ", dept='" + dept + '\'' +
                ", marriage=" + marriage +
                '}';
    }
}
