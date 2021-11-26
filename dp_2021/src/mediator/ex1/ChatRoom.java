package mediator.ex1;

import java.util.Hashtable;

public class ChatRoom {
	Hashtable<String, Participant> registry = new Hashtable<String, Participant>();

	public Hashtable<String, Participant> getRegistry() {
		return registry;
	}

	public void send(String from, String to, String message) {
		Participant part = (Participant) registry.get(to);
		part.receive(from, message);
	}

}
