package package7;

public class InheritanceDemo {

    public static void main(String args[]){
        SavingsAccount sa= new SavingsAccount("peter","abc","savings account",
                10,7000.0);

        System.out.println("Account Holder Name: "+ sa.accountHolderName);
        System.out.println("Bank Name: "+ sa.bankName);
        System.out.println("Account Type: "+ sa.accountType);
        System.out.println("Number of transactions in last week: "+ sa.noOfTransactions);
        System.out.println("Balance: "+ sa.balance);
        System.out.println("Min Balance: "+ sa.minBalance);
        System.out.println(sa.checkMinBalance());
    }
}
