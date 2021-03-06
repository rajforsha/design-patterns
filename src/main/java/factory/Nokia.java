package factory;

public class Nokia implements Mobile {

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

    public Nokia withName(String name){
       setName(name);
       return this;
    }

    public Nokia withPrice(long price){
        setPrice(price);
        return this;
    }

    @Override
    public String toString() {
        return "Nokia [name=" + this.name + ", price=" + this.price + "]";
    }


}
