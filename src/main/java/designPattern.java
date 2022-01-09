import java.util.Arrays;

public class designPattern {
    public static void main(String arg[]){

        //Singleton
        Singleton s1=Singleton.getInstance();
        Singleton s2=Singleton.getInstance();
        System.out.println("S1 : "+s1);
        System.out.println("S2 : "+s2);
        System.out.println(s1.equals(s2));
    }
}
