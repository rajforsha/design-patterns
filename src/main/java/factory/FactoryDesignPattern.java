package factory;

public class FactoryDesignPattern {


    public MobileFactory getMobileByName(String name){

        MobileFactory obj=null;

        if(name.equalsIgnoreCase("nokia")){
           obj= new Nokia().withName("Nokia").withPrice(5000);

        }

        if(name.equalsIgnoreCase("motorola")){
            obj= new Motorola().withName("Motorola").withPrice(10000);

        }

        if(name.equalsIgnoreCase("iphone")){
           obj= new Iphone().withName("iphone").withPrice(40000);

        }

        return obj;

    }

    public static void main(String[] args) {

        FactoryDesignPattern dp= new FactoryDesignPattern();

        Nokia nokia=(Nokia)dp.getMobileByName("nokia");
        System.out.println(nokia.toString());

        Motorola motorola=(Motorola)dp.getMobileByName("motorola");
        System.out.println(motorola.toString());

        Iphone iphone=(Iphone)dp.getMobileByName("iphone");
        System.out.println(iphone.toString());

    }

}
