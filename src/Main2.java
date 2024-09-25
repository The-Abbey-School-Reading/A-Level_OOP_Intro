public class Main2 {

    public static void main(String[] args){
        PaymentProcessor processor = new PaymentProcessor();

        // Processing different types of payments
        processor.processPayment("1234-5678-9012-3456", 150.00);
        processor.processPayment("9876543210", "BANK123", 200.00);
        processor.processPayment(5551345, 50.00);
    }
}
