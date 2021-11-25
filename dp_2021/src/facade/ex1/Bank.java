package facade.ex1;

public class Bank {
    public void checkAccount(Customer c){
        System.out.println( "validating Account for "+c.getName()+" with acc No"+c.getAccotntNo());
    }
}
