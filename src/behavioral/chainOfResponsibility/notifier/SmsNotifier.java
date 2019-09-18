package behavioral.chainOfResponsibility.notifier;

public class SmsNotifier extends Notifire {

    public SmsNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Sending SMS to manager " + message);
    }
}
