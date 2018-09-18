package factory;

public class FactoryDesignPatternExample {

    public static void main(String[] args) {

        MobileFactory dp= new MobileFactory();

        Nokia nokia=(Nokia)dp.getMobileByName("nokia");
        System.out.println(nokia.toString());

        Motorola motorola=(Motorola)dp.getMobileByName("motorola");
        System.out.println(motorola.toString());

        Iphone iphone=(Iphone)dp.getMobileByName("iphone");
        System.out.println(iphone.toString());

    }


}
