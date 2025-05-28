package saad;

class BankAccount {
    private double balance = 10000;

    public synchronized void  withdraw(String name, double amount) {
        if (balance >= amount) {
            System.out.println(name + " is trying to withdraw $" + amount);
            try {
                Thread.sleep(1000); // Simulate delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            balance -= amount;
            System.out.println(name + " completed withdrawal. Remaining balance: $" + balance);
        } else {
            System.out.println(name + " tried to withdraw $" + amount + " but insufficient funds. Remaining: $" + balance);
        }
    }
}
