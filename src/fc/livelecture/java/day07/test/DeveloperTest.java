package fc.livelecture.java.day07.test;

import fc.livelecture.java.day07.domain.Developer;

public class DeveloperTest {
    public static void main(String[] args) {
        Developer developer = new Developer();

        developer.setName("Hong");
        developer.setAge(20);
        developer.setLanguage("Java");

        String language = developer.getLanguage();

        developer.favoriteLanguage(language);

    }
}
