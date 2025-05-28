package saad;

class Person extends Thread {
    private BankAccount account;
    private String personName;
    private double withdrawAmount;

    public Person(BankAccount account, String personName, double withdrawAmount) {
        this.account = account;
        this.personName = personName;
        this.withdrawAmount = withdrawAmount;
    }

    public void run() {
        account.withdraw(personName, withdrawAmount);
    }
}
