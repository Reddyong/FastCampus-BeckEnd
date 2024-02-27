package fc.java.part3;

import fc.java.model.PersonVO;

public class ConstructorInit {
    public static void main(String[] args) {
        PersonVO personVO = new PersonVO("Hong", 27, "010-1234-5678");
        PersonVO personVO1 = new PersonVO("Lee", 20, "010-2222-3333");
        PersonVO personVO2 = new PersonVO("Kim", 21, "010-1111-2222");

        System.out.println("personVO = " + personVO);
        System.out.println("personVO1 = " + personVO1);
        System.out.println("personVO2 = " + personVO2);
    }
}
