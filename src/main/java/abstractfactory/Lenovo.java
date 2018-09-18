package abstractfactory;

public class Lenovo implements Laptop {

    private String name;

    private long price;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPrice() {
        return this.price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Lenovo [name=" + this.name + ", price=" + this.price + "]";
    }

}
