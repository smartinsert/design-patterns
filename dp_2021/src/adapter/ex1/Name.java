package adapter.ex1;

public class Name {
	String firstName;
	String lastName;
	private NamePrinterAdapter adapter;

	public void setAdapter(NamePrinterAdapter adapter) {
		this.adapter = adapter;
	}

	public Name(String firstName, String lastName) {
	this.firstName=firstName;
	this.lastName=lastName;
	}

	public void printName() {
		adapter.printName(firstName,lastName);
	}
}