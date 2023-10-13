package behavioral.chain;

public class Main {
    public static void main(String[] args) {
        Notifier simpleNotifier = new SimpleNotifier(Priority.ROUTINE);
        Notifier emailNotifier = new EmailNotifier(Priority.IMPORTANT);
        Notifier smsNotifier = new SMSNotifier(Priority.ASAP);

        simpleNotifier.setNextNotifier(emailNotifier);
        emailNotifier.setNextNotifier(smsNotifier);

        simpleNotifier.manage("Все в порядке", Priority.ROUTINE);
        simpleNotifier.manage("Что-то пошло не так", Priority.IMPORTANT);
        simpleNotifier.manage("Все плохо!", Priority.ASAP);
    }
}
