package behavioral.chain;

public abstract class Notifier {
    private int priority;
    private Notifier nextNotifier;

    public Notifier(int priority) {
        this.priority = priority;
    }

    public void setNextNotifier(Notifier nextNotifier) {
        this.nextNotifier = nextNotifier;
    }

    public void manage(String message, int level){
        if (level >= priority){
            write(message);
        }
        if (nextNotifier != null){
            nextNotifier.manage(message, level);
        }
    }

    abstract void write(String message);
}
