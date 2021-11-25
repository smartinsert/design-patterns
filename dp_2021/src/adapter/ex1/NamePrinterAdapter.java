package adapter.ex1;

public class NamePrinterAdapter {
    private NamePrinter adaptee;
    public void printName(String firstName, String lastName){
        adaptee.printFullName(firstName+" "+lastName);
    }

    public void setAdaptee(NamePrinter adaptee) {
        this.adaptee = adaptee;
    }
}
