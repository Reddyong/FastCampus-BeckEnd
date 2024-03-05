package fc.livelecture.java.day07.domain;

public class Developer {
    private String name;
    private int age;
    private String language;

    public Developer() {
    }

    public Developer(String name, int age, String language) {
        this.name = name;
        this.age = age;
        this.language = language;
    }

    public void favoriteLanguage(String language) {
        System.out.println("my favorite language is " + language);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", language='" + language + '\'' +
                '}';
    }
}
