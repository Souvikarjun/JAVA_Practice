public class Bank {
    String accountNumber;
    String accountHolderName;
    float Balance;
    String accountType;

    float Transfer(Bank cust1, Bank cust2, float sent){
        
        cust2.Balance = cust2.Balance - sent;
        return cust1.Balance + sent;
    }

    float Withdraw(Bank cust, float withdraw){
        System.out.println(withdraw +" is Withdrawn");
        return cust.Balance + withdraw;  
    }
    
    float Deposit(Bank cust, float Depo){

        return cust.Balance + Depo;  
    }
    public static void main(String[] args) {
        Bank No1 = new Bank();
        Bank No2 = new Bank();
        Bank No3 = new Bank();
        

        No2.Balance = 40000;
        No1.Balance = 100000;
        No3.Balance = 10000;

        No2.Balance = No2.Transfer(No2, No1, 50000);

        System.out.println(No2.Balance +" "+ No1.Balance);

    }
}
