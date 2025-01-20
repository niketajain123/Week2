class BankAccountManagement{
    public long accountNumber;
    protected String accoutHolder;
    private double balance;
    //parameterized constructor
    public BankAccountManagement(long accountNumber,String accoutHolder,double balance){
        this.accountNumber=accountNumber;
        this.accoutHolder=accoutHolder;
        this.balance=balance;
    }
    public void modifyBalance(double balance){
        this.balance=balance;
    }
    public void display(){
        System.out.println("Account holder : "+accoutHolder+", Account number : "+accountNumber+", Balance : "+balance);
    }
}
class SavingsAccount extends BankAccountManagement{
    public SavingsAccount(long accountNumber,String accountHolder,double balance){
        super(accountNumber,accountHolder,balance);
    }
    public void displayAccountNumber(){
        System.out.println("Account number : "+accountNumber);
    }
    public void displayAccountHolder(){
        System.out.println("Account holder : "+accoutHolder);
    }
}
public class BankAccountManagementMain {
    public static void main(String[] args) {
        BankAccountManagement account1=new BankAccountManagement(11111111111l,"abc",89000);
        System.out.println("Account1:");
        account1.display();
        account1.modifyBalance(85000);
        System.out.println("Account1 after modifying balance : ");
        account1.display();
        SavingsAccount account2=new SavingsAccount(22222222222l,"xyz",75000);
        System.out.println("Account2: ");
        account2.displayAccountHolder();
        account2.displayAccountNumber();

    }
}
