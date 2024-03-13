package fc.java.course2.part3;

import com.google.gson.Gson;
import fc.java.course2.model.Member;
import fc.java.course2.model.Person;

public class GsonMemAddFromJson {
    public static void main(String[] args) {
        String json = "{\"name\":\"Hong\",\"age\":30,\"email\":\"dddd@dddd.com\",\"address\":{\"city\":\"Seoul\",\"country\":\"Korea\"}}";

        Gson gson = new Gson();

        Person person = gson.fromJson(json, Person.class);

        System.out.println("member = " + person);

    }
}
