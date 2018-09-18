package abstractfactory;

public class Nokia implements Mobile {

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
        return "Nokia [name=" + this.name + ", price=" + this.price + "]";
    }

}
