package behavioral.chain;

public class EmailNotifier extends Notifier {
    public EmailNotifier(int priority) {
        super(priority);
    }

    @Override
    void write(String message) {
        System.out.println("Пишем на email: " + message);
    }
}
