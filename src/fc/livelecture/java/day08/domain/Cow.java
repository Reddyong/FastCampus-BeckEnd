package fc.livelecture.java.day08.domain;

public class Cow extends Animal {
    @Override
    public void cry() {
        System.out.println("mmooooooo");
    }

    public void eat() {
        System.out.println("umoolumool");
    }
}
