package fc.java.course2.part1;

import com.google.gson.Gson;
import fc.java.course2.model.Person;

import java.util.Random;

public class GsonFromAPI {
    public static void main(String[] args) {
        String json = "{\"name\":\"Hong\",\"age\":25}";
        Gson gson = new Gson();
        Person person = gson.fromJson(json, Person.class);
        System.out.println("person = " + person);
    }
}
