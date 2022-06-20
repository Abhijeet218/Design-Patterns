package AbstractFactory;

public class WindowsFactory implements OSFactory{
    @Override
    public Phones create(ManufactureType manufactureType) {

        switch (manufactureType){
            case SAMSUNG:
                return new SamsungPhone();
            default:
                return null;
        }
    }
}
