package proxy.ex2;

public class Proxy implements Subject {
    private RealSubject subject;

    public Proxy() {
        this.subject = new RealSubject();
    }

    @Override
    public void sayHello() {
        System.out.print("hey ");
        subject.sayHello();
        System.out.print("!");
    }
}
