package abstractfactory;

public class AbstractFactoryDesingnPatternExample {

    public static void main(String[] args) {

        AbstractFactory factory=FactoryProducer.getFactoryByName("laptop");
        Lenovo lenovo=(Lenovo)factory.getlaptopFactory("lenovo");
        System.out.println(lenovo);
    }

}
