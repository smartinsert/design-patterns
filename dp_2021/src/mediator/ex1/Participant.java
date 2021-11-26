package mediator.ex1;

public class Participant {

	ChatRoom chatRoom;
	String name;

	public Participant(ChatRoom chatRoom, String name) {
		this.chatRoom = chatRoom;
		this.name = name;
		chatRoom.getRegistry().put(name, this);
	}

	public void send(String to, String message) {
		chatRoom.send(this.name, to, message);
		System.out.println(message+" sent to "+name);
	}

	public String receive(String from, String message) {
		System.out.println(message + " received from " + from);
		return message + " received from " + from;
	}
}
