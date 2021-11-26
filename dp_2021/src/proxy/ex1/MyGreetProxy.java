package proxy.ex1;

public class MyGreetProxy extends Subject{
    @Override
    public void sayHello() {
        System.out.print("hey ");
        super.sayHello();
        System.out.print("!");
    }
}
