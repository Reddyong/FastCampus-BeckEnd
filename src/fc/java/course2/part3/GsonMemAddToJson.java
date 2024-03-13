package fc.java.course2.part3;

import com.google.gson.Gson;
import fc.java.course2.model.Address;
import fc.java.course2.model.Person;

public class GsonMemAddToJson {
    public static void main(String[] args) {
        Address address = new Address("Seoul", "Korea");
        Person person = new Person("Hong", 30, "dddd@dddd.com", address);

        Gson gson = new Gson();
        String json = gson.toJson(person);

        System.out.println("json = " + json);
    }
}
