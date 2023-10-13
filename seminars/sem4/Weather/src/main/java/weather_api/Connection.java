package weather_api;

import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Connection {

    //Зарегистрируйтесь на сайте weatherstack.com и получите свой ключ при использовании заменить!
    private static final String apiKey = "eceae5bae9142cc79ef4bb4199703b7f";
    //http://api.weatherstack.com/current?access_key=eceae5bae9142cc79ef4bb4199703b7f&query=moscow

    public String getJson(String city) throws Exception{
        StringBuilder stringBuilder = new StringBuilder();

        URL url = new URL("http://api.weatherstack.com/current?access_key=" + apiKey + "&query=" + city);
        URLConnection connection = url.openConnection();
        Scanner scanner = new Scanner(connection.getInputStream());
        while (scanner.hasNext()) {
            stringBuilder.append(scanner.nextLine());
        }

        System.out.println("от сервера пришел ответ: " + stringBuilder);
        return stringBuilder.toString();
    }
}
