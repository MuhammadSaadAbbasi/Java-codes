package ExceptionHandling1;

class transferException extends Exception {
    public transferException(String message) {
        super(message);
    }
}

public class bankTransfer {
    private double balance;

    bankTransfer() {
        this.balance = 5000;
    }

    double getBalance() {
        return balance;
    }

    void transfer(bankTransfer recipient, double amount) throws transferException {
        if (amount <= 0) {
            throw new transferException("Transfer amount must be greater than zero.");
        }
        if (this.balance < amount) {
            throw new transferException("Insufficient balance for transfer.");
        }

        recipient.balance += amount;
        this.balance -= amount;
    }

    public static void main(String[] args) {
        bankTransfer sender = new bankTransfer();
        bankTransfer receiver = new bankTransfer();

        try {
            sender.transfer(receiver, 500); // valid transfer
            System.out.println("Sender Balance: " + sender.getBalance());
            System.out.println("Receiver Balance: " + receiver.getBalance());
        } catch (transferException e) {
            System.out.println("Transfer Failed: " + e.getMessage());
        }
    }
}
