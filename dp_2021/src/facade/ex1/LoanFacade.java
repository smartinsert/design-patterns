package facade.ex1;

public class LoanFacade implements Facade{
    Bank bank;
    Credit credit;
    Loan loan;

    public LoanFacade() {
        this.bank = new Bank();
        this.credit = new Credit();
        this.loan = new Loan();
    }

    @Override
    public String applyForLoan(Customer customer) {
        bank.checkAccount(customer);
        credit.checkCredit(customer);
        loan.checkEligibility(customer);
        return "loan Approved..";
    }
}
