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

    public String getImg() {
        return img;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
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
