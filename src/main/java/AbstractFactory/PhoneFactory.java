package AbstractFactory;

public class PhoneFactory {

    public static OSFactory getFactory(OSType osType){

        switch (osType){
            case ANDORID:
                return null;
            case WINDOWS:
                return null;
            default:
                return null;
        }

    }
}
