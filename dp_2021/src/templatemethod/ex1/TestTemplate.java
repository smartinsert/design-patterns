package templatemethod.ex1;

abstract class CheckBackground {
  
    public abstract void checkBank();
    public abstract void checkCredit();
    public abstract void checkLoan();
    public abstract void checkStock();
    public abstract void checkIncome();

  //work as template method
    public final void check() {
        checkBank();
        checkCredit();
        checkLoan();
        checkStock();
        checkIncome(); 
    }
}

class LoanApp extends CheckBackground {
    private String name;
   
    public LoanApp(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public void checkBank() {
        //ck acct, balance
        System.out.println("check bank...");
    }

    public void checkCredit() {
        //ck score from 3 companies
        System.out.println("check credit...");
    }

    public void checkLoan() {
        //ck other loan info
        System.out.println("check other loan...");
    }

    public void checkStock() {
        //ck how many stock values
        System.out.println("check stock values...");
    }

    public void checkIncome() {
        //ck how much a family make
        System.out.println("check family income...");
    }
   
    //other methods
}

class TestTemplate {
    public static void main(String[] args) {
        
        CheckBackground mortgageClient = new LoanApp("Judy");
       // System.out.println("\nCheck client " + mortgageClient.getName()+ " Mortgage loan application. ");
        mortgageClient.check();
        
        CheckBackground equityloanClient = new LoanApp("Mark");
       // System.out.println("\nCheck client " + equityloanClient.getName()+ " equity loan application. ");
        equityloanClient.check();
    }
}

