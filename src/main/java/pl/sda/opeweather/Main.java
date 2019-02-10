package pl.sda.opeweather;

import com.fasterxml.jackson.databind.ObjectMapper;
import pl.sda.opeweather.model.Weather;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class Main {

    public static void main(String[] args) {


        WeatherService weatherService = new WeatherService(
                "http://api.apixu.com/v1/current.json",
                "23f7a82df6764a3986590706191002");
        
        weatherService.getCityWeatherFullInfo("Bydgoszcz");
        weatherService.getCityWeatherOnlyTemp("Bydgoszcz");





    }
}
