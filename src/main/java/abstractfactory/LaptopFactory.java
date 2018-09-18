package abstractfactory;

public class LaptopFactory extends AbstractFactory {

    @Override
    Laptop getlaptopFactory(String name) {

        Laptop laptopFactory=null;

        if(name.equalsIgnoreCase("lenovo")){
            Lenovo lenovo= new Lenovo();
            lenovo.setName(name);
            lenovo.setPrice(30000);

            laptopFactory=lenovo;
        }

        return laptopFactory;
    }

    @Override
    Mobile getMobileFactory(String name) {
        return null;
    }

}
