import AbstractFactory.AbstractFactory;
import AbstractFactory.OSType;
import AbstractFactory.Phones;
import AbstractFactory.ManufactureType;
import AbstractFactory.OSFactory;
import BuilderPattern.Phone;
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

        /*
        *  Builder Pattern Example
        * */
        System.out.println("******* Builder Pattern Example *******");
        Phone.Builder builder = new Phone.Builder()
                .camera("20MP")
                .processor("AMD");

        Phone phone= builder.build();
        System.out.println(phone.toString());

        /*
        * Abstract Factory pattern
        * */
        System.out.println("******* Abstract-Factory Pattern Example *******");
        OSFactory osFactory = AbstractFactory.getFactory(OSType.ANDORID);
        Phones phones = osFactory.create(ManufactureType.GOOGLE);
        phones.create();

        OSFactory osFactoryW = AbstractFactory.getFactory(OSType.WINDOWS);
        Phones phonesW = osFactoryW.create(ManufactureType.SAMSUNG);
        phonesW.create();

    }
}
