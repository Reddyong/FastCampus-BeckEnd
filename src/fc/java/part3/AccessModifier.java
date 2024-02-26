package fc.java.part3;

import fc.java.model.MemberDTO;

public class AccessModifier {
    public static void main(String[] args) {
        MemberDTO member = new MemberDTO("Hong", 27, "010-1234-5678");

        System.out.println("member = " + member);
    }
}
