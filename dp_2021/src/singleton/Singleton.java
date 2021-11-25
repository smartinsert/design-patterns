package singleton;

public class Singleton {
    private static Singleton instance;

    private Singleton(){
        System.out.println("The singleton has been created..");
    }

    public static Singleton instance(){
        if(instance==null){
            instance=new Singleton();
            return instance;
        }else{
            return  instance;
        }
    }
}
