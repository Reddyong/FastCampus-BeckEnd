package fc.java.course2.part3;

import com.google.gson.Gson;
import fc.java.course2.model.Member;

public class GsonToJson {
    public static void main(String[] args) {
        Member member = new Member("Hong", 25, "dddd@dddd.com");

        Gson gson = new Gson();
        String json = gson.toJson(member);

        System.out.println("json = " + json);
    }
}
