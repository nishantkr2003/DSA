package in.kgcoding.challange78;

public class Customer {

    public static void main(String[] args) {
        BancAccount account = new BancAccount("123456789", "Nishant Kumar");

        account.depositMoney(100);
        System.out.println(account.withdrawMoney(200));
        account.depositMoney(-40);
        account.withdrawMoney(0);
    }

    
    
}