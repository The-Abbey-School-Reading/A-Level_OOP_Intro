public class PaymentProcessor {

    String creditCardNumber;
    String bankAccountNumber;
    double amount;
    String bankCode;
    int mobileNumber;

    // Method to process credit card payment
    public void processPayment(String creditCardNumber, double amount) {
        System.out.println("Processing credit card payment of $" + amount + " for card: " + creditCardNumber);
    }

    // Method to process bank transfer payment
    public void processPayment(String bankAccountNumber, String bankCode, double amount) {
        System.out.println("Processing bank transfer of $" + amount + " to account: " + bankAccountNumber + " with bank code: " + bankCode);
    }

    // Method to process mobile payment
    public void processPayment(int mobileNumber, double amount) {
        System.out.println("Processing mobile payment of $" + amount + " for mobile number: " + mobileNumber);
    }
}




