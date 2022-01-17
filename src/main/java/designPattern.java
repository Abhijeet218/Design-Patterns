import FactoryPattern.Laptop;
import FactoryPattern.LaptopFactory;
import FactoryPattern.LaptopType;
import Singleton.Singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class designPattern {
    public static void main(String arg[]){

        //Singleton.Singleton
        Singleton s1= Singleton.getInstance();
        Singleton s2=Singleton.getInstance();
        Singleton s3break=null;
        //Breaking Singleton.Singleton Pattern
        Constructor[] constructors=Singleton.class.getDeclaredConstructors();
        for(Constructor constructor:constructors){
            constructor.setAccessible(true);
            try {
                s3break= (Singleton) constructor.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }

        System.out.println("S1 : "+s1);
        System.out.println("S2 : "+s2);
        System.out.println("S3 : "+s3break);
        System.out.println(s1.equals(s2));

        /*
        * Factory Pattern Example
        * */
        System.out.println("******* Factory Pattern Example *******");
        Laptop hp= LaptopFactory.getLaptop(LaptopType.HP);
        Laptop mac=LaptopFactory.getLaptop(LaptopType.MAC);
        System.out.println(hp.getConfiguration());
        System.out.println(hp.toString());
        System.out.println(mac.getConfiguration());
        System.out.println(mac.toString());

    }
}
