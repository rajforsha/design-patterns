package abstractfactory;

public class FactoryProducer {

    public static AbstractFactory getFactoryByName(String name){

        if(name.equalsIgnoreCase("laptop")){
            return new LaptopFactory();
        }

        return null;
    }



}
