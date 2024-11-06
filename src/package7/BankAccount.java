package package7;

// inheritance is-a relationship
public class BankAccount {

    protected String accountHolderName;
    protected String bankName;
    protected String accountType;
    protected int noOfTransactions;

    public BankAccount(String accountHolderName, String bankName,
                       String accountType, int noOfTransactions){
        this.accountHolderName= accountHolderName;
        this.bankName= bankName;
        this.accountType= accountType;
        this.noOfTransactions= noOfTransactions;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public int getNoOfTransactions() {
        return noOfTransactions;
    }

    public void setNoOfTransactions(int noOfTransactions) {
        this.noOfTransactions = noOfTransactions;
    }


}
