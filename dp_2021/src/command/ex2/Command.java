package command.ex2;
//command
public interface Command {
    public void execute();
}

//concrete command
class GoodMorning implements Command {
    private Greeter greeter;

    public GoodMorning(Greeter greeter) {
        this.greeter = greeter;
    }

    @Override
    public void execute() {
        greeter.sayGoodMorning();
    }
}
//concrete command
class GoodEvening implements Command {
    private Greeter greeter;

    public GoodEvening(Greeter greeter) {
        this.greeter = greeter;
    }

    @Override
    public void execute() {
        greeter.sayGoodEvening();
    }
}

//Receiver
class Greeter {

    public void sayGoodMorning() {
        System.out.println("Good morning");
    }

    public void sayGoodEvening() {
        System.out.println("Good GoodEvening");
    }

}

//Invoker
class MessageService {

    public void greetEvening(Command command) {
        command.execute();
    }

    public void greetMorning(Command command) {
        command.execute();
    }
    public void greet(Command command) {
        command.execute();
    }

}

//Client

class ClientMain {
    public static void main(String[] args) {
        Greeter greeter= new Greeter();
        Command morningCommand = new GoodMorning(greeter);
        Command eveningCommand = new GoodEvening(greeter);

        MessageService service= new MessageService();
      //  service.greetEvening(morningCommand);
       // service.greetMorning(eveningCommand);
        service.greet(eveningCommand);
    }
}