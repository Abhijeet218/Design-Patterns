package AbstractFactory;

public class SamsungPhone implements Phones{
    @Override
    public void create() {
        System.out.println("Samsung Phones");
    }
}
