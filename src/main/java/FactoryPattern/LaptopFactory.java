package FactoryPattern;

public class LaptopFactory {

    public static Laptop getLaptop(LaptopType laptopType){
        switch (laptopType){
            case HP:
                return new Hp("8GB","Intel");
            case MAC:
                return new Mac("8GB","M1","512GB");
        }

        return null;
    }
}
