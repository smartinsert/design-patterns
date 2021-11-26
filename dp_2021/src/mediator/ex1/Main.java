package mediator.ex1;

public class Main {

	public static void main(String[] args) {
		ChatRoom cr = new ChatRoom();
		Participant rajesh = new Participant(cr, "Rajesh");
		Participant nik = new Participant(cr, "Nikhil");
		rajesh.send("Nikhil", "Hello Nikhil");
		
		
	}

}
