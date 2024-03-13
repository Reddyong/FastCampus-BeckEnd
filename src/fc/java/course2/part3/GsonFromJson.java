package fc.java.course2.part3;

import com.google.gson.Gson;
import fc.java.course2.model.Member;

public class GsonFromJson {
    public static void main(String[] args) {
        String json = "{\"name\":\"Hong\",\"age\":25,\"email\":\"dddd@dddd.com\"}";

        Gson gson = new Gson();

        Member member = gson.fromJson(json, Member.class);
        System.out.println("member = " + member);

    }
}
