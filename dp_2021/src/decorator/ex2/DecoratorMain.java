package decorator.ex2;

public class DecoratorMain {
    public static void main(String[] args) {
        Greeter greeter= new Greeter();
        MessageDocorator decorator=new MessageDocorator(greeter);

        System.out.printf(decorator.greet());
    }
}
