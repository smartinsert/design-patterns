package facade.ex1;

public class Main {
    public static void main(String[] args) {
        Customer c1 = new Customer("Shantanu",60000,1234567);

        Facade facade= new LoanFacade() ;
        String resp= facade.applyForLoan(c1);

    }
}
