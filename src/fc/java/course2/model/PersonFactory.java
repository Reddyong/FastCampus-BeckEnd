package fc.java.course2.model;

@FunctionalInterface
public interface PersonFactory {
    Person create(String name, int age);
}
