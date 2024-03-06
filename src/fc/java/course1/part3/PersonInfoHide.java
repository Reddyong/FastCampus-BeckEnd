package fc.java.course1.part3;

import fc.java.course1.model.PersonVO;

public class PersonInfoHide {
    public static void main(String[] args) {
        PersonVO personVO = new PersonVO();

        personVO.setName("Hong");
        personVO.setAge(27);
        personVO.setPhoneNumber("010-1234-5678");

        System.out.println("personVO = " + personVO);
    }
}
