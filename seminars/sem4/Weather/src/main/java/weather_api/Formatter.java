package weather_api;

import com.google.gson.Gson;
import weather_api.weather.Weather;

public class Formatter {
    public Weather parse(String json){
        Gson gson = new Gson();
        Weather weather = gson.fromJson(json, Weather.class);
        return weather;
    }
}
