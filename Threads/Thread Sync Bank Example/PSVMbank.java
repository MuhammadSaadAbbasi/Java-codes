package saad;

public class PSVMbank {
    public static void main(String[] args) {
        BankAccount sharedAccount = new BankAccount();

        Person p1 = new Person(sharedAccount, "Alice", 1000);
        Person p2 = new Person(sharedAccount, "Bob", 800);
        Person p4 = new Person(sharedAccount, "saad", 800);
        Person p3 = new Person(sharedAccount, "AR", 800);
        Person p6 = new Person(sharedAccount, "ali", 800);
        Person p7 = new Person(sharedAccount, "kazmi", 800);
        
        
        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p7.start();
        p6.start();
        
    }
}
