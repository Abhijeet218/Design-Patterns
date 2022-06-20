package AbstractFactory;



public interface OSFactory {
    Phones create(ManufactureType manufactureType);
}
