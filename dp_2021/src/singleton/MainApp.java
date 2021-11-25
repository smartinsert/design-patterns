package singleton;

public class MainApp {
    public static void main(String[] args) {
        Singleton s1= Singleton.instance();
        Singleton s2=Singleton.instance();
        Singleton s3=Singleton.instance();
        Singleton s4=Singleton.instance();
        System.out.println(s1==s2);

    }
}
