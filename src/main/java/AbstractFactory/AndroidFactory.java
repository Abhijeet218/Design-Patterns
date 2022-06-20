package AbstractFactory;

public class AndroidFactory implements OSFactory{
    @Override
    public Phones create(ManufactureType manufactureType) {

        switch (manufactureType){
            case GOOGLE:
                return new GooglePhone();
            default:
                return null;
        }
    }
}
