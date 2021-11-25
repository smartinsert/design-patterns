package facade.ex1;

public class Loan {
    public void checkEligibility(Customer c){
        System.out.println( "Loan approved for  "+c.getName()+" with amount"+c.getLoanAmount());
    }
}
