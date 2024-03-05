package fc.livelecture.java.day08.domain;

public class Chicken extends Animal {
    @Override
    public void cry() {
        System.out.println("KoKoDak");
    }

    public void fly() {
        System.out.println("padakpadak");
    }
}
