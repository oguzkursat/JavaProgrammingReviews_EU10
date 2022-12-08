package day31_Constructors;

public class CapitalOne {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
        BankAccount account3 = new BankAccount();
        BankAccount account4 = new BankAccount();
        BankAccount account5 = new BankAccount();

        System.out.println(account1);
        account1.setInfo("Ahmet Ozkok",123456789);
        account1.deposit(1000);
        account1.checkBalance();

        account1.withdraw(900);
        account1.checkBalance();
        System.out.println(account1);

        System.out.println("-------------------------------------------------------------");

        account2.setInfo("Aygun",987456123);
        System.out.println(account2);

        account2.deposit(10000);
        account2.checkBalance();





    }
}
