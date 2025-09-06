// simple banking system
class BankAccount{
    // data (encapsulation) 
    protected int accountnumber;
    protected String accountholder;
    protected int balance=0;
    public int rate=5;
    // methods and constructor
    BankAccount(int accountnumber,String name , int balance){
        this.accountnumber=accountnumber;
        this.accountholder=name;
        this.balance=balance;
    }
    public void getAccountnumber(){
        System.out.println("The Accountnumber is :"+this.accountnumber);
    }
    public void getholder(){
        System.out.println("Account Holder name is : "+this.accountholder);
    }
    public void getbalance(){
        System.out.println("The balance is :"+this.balance);
    }
    public void checkinterstrate(int time){
        //  Customer will get 5% of interest in 1 year 
        int interest=(this.balance *rate*time)/100;
        System.out.println("The interest is "+interest+" in "+time+ " year");
    }

    public void Accountinfo(){
        System.out.println("Account Holder name is : "+accountholder);
        System.out.println("The AccountNumber is : "+accountnumber);
        System.out.println("The Account balance is : "+balance);
    }

    public void deposit(int amount){
        this.balance+=amount;
        System.out.println(amount+" sucessfully added to your bank account ");
        System.out.println("Current balance is "+this.balance);
    }
    public void withdraw(int amount){
        this.balance-=amount;
        System.out.println(amount+" debited from your bank account ");
        System.out.println("Your Current balance is "+this.balance);
    }

}
// Derived Class
class SavingAccount extends BankAccount{
    SavingAccount(int accountnumber, String name, int balance) {
        super(accountnumber, name, balance);
    }
    public void Accountinfo(){
        System.out.println("Account Holder name is : "+accountholder);
        System.out.println("The AccountNumber is : "+accountnumber);
        System.out.println("The Account balance is : "+balance);
        System.out.println("The Interest Rate is : "+rate+"%");
    }
    

    public void withdraw(int amount){
        if(this.balance<=500){
            System.out.println("The minimum balance should 500 ");
        }
        else{
            this.balance-=amount;
            System.out.println(amount+ " is debited from your account ");
            System.out.println("Your Current balance is "+this.balance);

        }
    }
}
// Another Derived Class
class CurrentAccount extends BankAccount{
    CurrentAccount(int accountnumber,String name,int balance){
        super(accountnumber, name, balance);
    }
    protected int overdraftlimit=1000;

    public void withdraw(int amount){
        if(balance+overdraftlimit>=amount){
            balance-=amount; /* balance will be negative when amount>balance and overdraftlimit  */
            System.out.println(amount+ " is debited from your account ");
        }
        else{
            System.out.println("Exeeds the overdraft limit ");
        }
    }


}
public class bankopps {
    public static void main(String[] args) {
        BankAccount sav = new SavingAccount(12345, "Gouransh Bhandari", 1200);
        BankAccount curr = new CurrentAccount(6969, "Daku Mangal Singh", 100);
        // Saving Account test
        System.out.println("\n--- Saving Account Tests ---");
        sav.Accountinfo();

        // Deposit
        sav.deposit(1000);

        // Withdraw that still keeps min balance
        sav.withdraw(500);   // Allowed (balance > 500)

        // Withdraw that will break min balance rule
        sav.withdraw(800);   // Not allowed if balance < 500

        // Interest check
        sav.checkinterstrate(2);  // 2 years ka simple interest

        sav.getbalance();
        
        // Current Account Test
        System.out.println("\n--- Current Account Tests ---");
        curr.Accountinfo();

        // Deposit
        curr.deposit(500);

        // Withdraw within balance
        curr.withdraw(700);   // Allowed, balance = 300

        // Withdraw using overdraft (balance negative but within limit)
        curr.withdraw(1200);  // Allowed, overdraft used

        

        curr.getbalance();
  
    }
}

