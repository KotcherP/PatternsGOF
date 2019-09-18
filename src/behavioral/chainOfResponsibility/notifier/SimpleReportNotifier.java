package behavioral.chainOfResponsibility.notifier;

public class SimpleReportNotifier extends Notifire {
    public SimpleReportNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Notifying using simple report " + message);
    }
}
