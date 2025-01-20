class BankAccount{
    private static String bankName="ABC Bank";
    private String accountHolder;
    private final int accountNumber;
    private static int count;
    public BankAccount(String accountHolder,int accountNumber){
        this.accountHolder=accountHolder;
        this.accountNumber=accountNumber;
        count++;
    }
    public void display(){
        System.out.println("Account Holder : "+accountHolder);
        System.out.println("Account Number : "+accountNumber);
        System.out.println("Bank name : "+bankName);
    }
    public static int getTotalCounts(){
        return count;
    }
}
public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account1=new BankAccount("abc",1111);
        BankAccount account2=new BankAccount("xyz",2222);
        if(account1 instanceof BankAccount) {
            System.out.println("Account1:");
            account1.display();
        }
        if(account2 instanceof BankAccount) {
            System.out.println("Account2:");
            account2.display();
        }
        System.out.println("Total number of accounts in bank : "+BankAccount.getTotalCounts());
    }

}
