package behavioral.chainOfResponsibility.notifier;

public abstract class Notifire {
    private int priority;
    private Notifire nextNotifier;

    public Notifire(int priority) {
        this.priority = priority;
    }

    public void setNextNotifier(Notifire nextNotifier) {
        this.nextNotifier = nextNotifier;
    }

    public void notifierManager(String message,int level){
        if(level >=priority){
            write(message);
        }

        if(nextNotifier != null){
            nextNotifier.notifierManager(message,level);
        }
    }

    public abstract void write(String message);
}
