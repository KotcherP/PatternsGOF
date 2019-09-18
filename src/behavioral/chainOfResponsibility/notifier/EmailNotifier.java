package behavioral.chainOfResponsibility.notifier;

public class EmailNotifier extends Notifire{

    public EmailNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Sending email " + message);
    }
}
