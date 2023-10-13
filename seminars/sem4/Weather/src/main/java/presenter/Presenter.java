package presenter;

import ui.View;
import weather_api.Service;
import weather_api.WeatherService;

public class Presenter {

    private View view;
    private Service service;

    public Presenter(View view) {
        this.view = view;
        service = new WeatherService();
    }

    public void getInfo(String city) {
        String answer = service.get(city);
        view.print(answer);
    }
}
