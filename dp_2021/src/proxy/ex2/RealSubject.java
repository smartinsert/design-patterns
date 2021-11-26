package proxy.ex2;

public class RealSubject implements Subject {
    @Override
    public void sayHello(){
        System.out.println("hello");
    }

}
