package decorator.ex2;

public class MessageDocorator {
    private Greeter greeter;

    public MessageDocorator(Greeter greeter) {
        this.greeter = greeter;
    }

    public String greet(){
        return "Hello "+greeter.greet()+"!";
    }


}
