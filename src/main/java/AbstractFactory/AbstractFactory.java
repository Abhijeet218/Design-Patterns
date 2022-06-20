package AbstractFactory;

public abstract class AbstractFactory {

    public static OSFactory getFactory(OSType osType){

        switch (osType){
            case ANDORID:
                return new AndroidFactory();
            case WINDOWS:
                return new WindowsFactory();
            default:
                return null;
        }
    }
}
