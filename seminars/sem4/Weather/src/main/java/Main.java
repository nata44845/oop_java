import ui.ConsoleUI;
import ui.DesktopUI;
import ui.View;
import weather_api.Connection;

public class Main {
    public static void main(String[] args) {
        View view = new DesktopUI();
        view.start();
    }
}
