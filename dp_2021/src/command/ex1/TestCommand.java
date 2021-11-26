package command.ex1;
/*the Invoker class*/
class Switch {
 
    private Command flipUpCommand;
    private Command flipDownCommand;
 
    public Switch(Command flipUpCmd,Command flipDownCmd){
         this.flipUpCommand=flipUpCmd;
         this.flipDownCommand=flipDownCmd;
    }
 
    public void flipUp(){
         flipUpCommand.execute();
    }
 
    public void flipDown(){
         flipDownCommand.execute();
    }
 
}
 
/*Receiver class*/
 
class Light{
 
     public Light(){  }
 
     public void turnOn(){
        System.out.println("The light is on");
     }
 
     public void turnOff(){
        System.out.println("The light is off");
     }
 
}
 
 
/*the Command interface*/
 
 interface Command{
    void execute();
}
 
 
/*the Command for turning on the light*/
 
class TurnOnCommand implements Command{
 
   private Light theLight;
 
   public TurnOnCommand(Light light){
        this.theLight=light;
       }
 
   public void execute(){
      theLight.turnOn();
   }
 
}
 
/*the Command for turning off the light*/
 
class TurnOffCommand implements Command{
 
   private Light theLight;
 
   public TurnOffCommand(Light light){
        this.theLight=light;
       }
 
   public void execute(){
      theLight.turnOff();
   }
 
}
 
/*The test class*/
public class TestCommand{
 
   public static void main(String[] args){
       Light lamp = new Light();

       Command switchUp=new TurnOnCommand(lamp );
       Command switchDown=new TurnOffCommand(lamp );
 
       Switch s=new Switch(switchUp,switchDown);
 
       s.flipUp();
       //s.flipDown();
   }
}
