package abstractfactory;

public abstract class AbstractFactory {

    abstract Laptop getlaptopFactory(String name);
    abstract Mobile getMobileFactory(String name);

}
