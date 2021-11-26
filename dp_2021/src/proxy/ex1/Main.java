package proxy.ex1;

public class Main {
    public static void main(String[] args) {
        //Subject s = new Subject();
        Subject s = new MyGreetProxy();
        s.sayHello();
    }
}
