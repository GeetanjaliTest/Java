package package7;

public class SavingsAccount extends BankAccount{

    double balance;
    double minBalance=5000.0;

    public SavingsAccount(String accountHolderName, String bankName,
                          String accountType, int noOfTransactions, double balance){
        super(accountHolderName, bankName,
                accountType,noOfTransactions);
        this.balance= balance;
    }

    public Boolean checkMinBalance(){
        if (minBalance < balance){
            addBalance();
            return minBalance > balance;
        }

        else {
            return minBalance > balance;
        }
    }

    // Add 5000 to minBalance and return the updated minBalance
    public double addBalance() {
        minBalance = minBalance + 5000;  // Update the instance variable
        return minBalance;  // Return the updated minBalance
    }

}
