public class MemberTest {
    public static void main(String[] args) {
        Member member = new Member();

        member.setName("hong");
        member.setAge(27);
        member.setPhoneNumber("010-1234-5678");
        member.setEmail("abc@naver.com");
        member.setAddress("seoul");
        member.setWeight(57.6);

        System.out.println("member = " + member);
    }
}
