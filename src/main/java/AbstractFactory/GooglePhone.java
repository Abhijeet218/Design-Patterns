package AbstractFactory;

public class GooglePhone implements Phones{
    @Override
    public void create() {
        System.out.println("Google Phone");
    }
}
