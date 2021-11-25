package facade.ex1;

public class Customer {
    String name;
    double loanAmount;
    int accotntNo;

    public Customer(String name, double loanAmount, int accotntNo) {
        this.name = name;
        this.loanAmount = loanAmount;
        this.accotntNo = accotntNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public int getAccotntNo() {
        return accotntNo;
    }

    public void setAccotntNo(int accotntNo) {
        this.accotntNo = accotntNo;
    }
}
