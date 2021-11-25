package adapter.ex1;

public class Main {
    public static void main(String[] args) {
        NamePrinterAdapter adapter=new NamePrinterAdapter();
        NamePrinter adaptee=new NamePrinter();
        adapter.setAdaptee(adaptee);

        Name name=new Name("Shantanu","Banerjee");
        name.setAdapter(adapter);
        name.printName();
    }
}
