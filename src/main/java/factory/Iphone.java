package factory;

public class Iphone implements MobileFactory {

    private String name;
    private long price;

    public String getName() {
        return this.name;
    }

    public long getPrice() {
        return this.price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public Iphone withName(String name) {
        setName(name);
        return this;
    }

    public Iphone withPrice(long price) {
        setPrice(price);
        return this;
    }

    @Override
    public String toString() {
        return "Iphone [name=" + this.name + ", price=" + this.price + "]";
    }


}