package Constructors;

public class BankAccount {
    public int accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, int accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static class SavingAccount {
        private BankAccount bankAccount;

        public SavingAccount(BankAccount bankAccount) {
            this.bankAccount = bankAccount;
        }

        public void diplayAccountInfo(){
            System.out.println("Bank Account Number: " + bankAccount.accountNumber);
            System.out.println("Account Holder: " + bankAccount.accountHolder);
            System.out.println("Balance: " + bankAccount.balance);
        }
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Sanyam", 1);
        SavingAccount savingAccount = new SavingAccount(bankAccount);
        bankAccount.setBalance(15000);
        savingAccount.diplayAccountInfo();


    }
}
