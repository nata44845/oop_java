package behavioral.observer;

public class Activity {
    public static void main(String[] args) {
        Button button1 = new Button(1);
        Button button2 = new Button(2);

        button1.registerObserver(new ClickListener());
        button2.registerObserver(new ClickListener());

        button2.onClick();
    }
}
