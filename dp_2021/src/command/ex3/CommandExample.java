package command.ex3;

//the command
interface Command {
	
	public void execute();
}

//concrete command
class Soilder implements Command {
	Task task;
	String name;

	public Soilder(String name, Task task) {
		this.name = name;
		this.task = task;
	}

	public void execute() {
		task.bomb();
	}
}

//concrete command
class FighterPoilet implements Command {
	String name;
	Task task;

	public FighterPoilet(String name, Task task) {
		this.name = name;
		this.task = task;
	}

	public void execute() {
		task.throwMissiles();
	}
}
//Invoker
class Chief {
	public static void attack(Command[] a) {
		for (int i = 0; i < a.length; i++)
			a[i].execute();
	}
}

//ClientApp
class CommandExample {
	public static void main(String[] a) {
		Task task = new Task();
		
		Command c[] = new Command[4];
		
		c[0] = new Soilder("PAVAN", task);
		c[1] = new Soilder("CHANDRAMOULI", task);
		c[2] = new FighterPoilet("SHANTANU", task);
		c[3] = new FighterPoilet("ARUN", task);

		Chief.attack(c);
	}
}