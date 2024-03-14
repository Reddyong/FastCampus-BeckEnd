package fc.livelecture.java.day10.model;

public class Item {
    private String img;
    private String name;
    private int price;
    private String description;

    public Item(String img, String name, int price, String description) {
        this.img = img;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Item{" +
                "img='" + img + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
