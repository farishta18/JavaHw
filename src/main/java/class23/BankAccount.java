package class23;

public class BankAccount {
   private String userName;
   private String password;
   private double accountBalance=120;

    public BankAccount(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public double getAccountBalance(String password) {
        if(password.equals(this.password)){
            return accountBalance;
        }else{
            return 0;
        }

    }
}
class BankTester{
    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount("User123","password");
        //System.out.println(bankAccount.getAccountBalance());
    }
}