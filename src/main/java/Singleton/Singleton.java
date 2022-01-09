package Singleton;

public class Singleton {

    private static Singleton init=null;

    private Singleton(){}

    //This pattern still can be breaked
    public static Singleton getInstance(){
        synchronized (Singleton.class) {
            if (init == null) {
                init = new Singleton();
            }
        }
        return init;
    }
}
