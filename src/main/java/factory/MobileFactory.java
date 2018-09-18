package factory;

public class MobileFactory {

    public Mobile getMobileByName(String name) {

        Mobile obj = null;

        if (name.equalsIgnoreCase("nokia")) {
            obj = new Nokia().withName("Nokia").withPrice(5000);

        }

        if (name.equalsIgnoreCase("motorola")) {
            obj = new Motorola().withName("Motorola").withPrice(10000);

        }

        if (name.equalsIgnoreCase("iphone")) {
            obj = new Iphone().withName("iphone").withPrice(40000);

        }

        return obj;

    }

}
