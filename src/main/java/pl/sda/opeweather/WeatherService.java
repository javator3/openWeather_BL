package pl.sda.opeweather;

import com.fasterxml.jackson.databind.ObjectMapper;
import pl.sda.opeweather.model.Weather;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class WeatherService {
    Scanner scanner = new Scanner(System.in);
    private String finalURL;
    private String url;
    private String apiKey;


    public WeatherService(String url, String apiKey) {
        this.url = url;
        this.apiKey = apiKey;
    }

    public void getCityWeatherFullInfo(String city){
        finalURL = url + "?key=" + apiKey + "&q=" + city;
        URL jsonURL = null;
        try {
            jsonURL = new URL(finalURL);
            ObjectMapper objectMapper = new ObjectMapper();
            Weather weather = objectMapper.readValue(jsonURL, Weather.class);
            System.out.println(weather);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void getCityWeatherOnlyTemp(){
        System.out.println("Podaj miasto dla którego mam sprawdzić pogode");
        String city = scanner.nextLine();
        finalURL = url + "?key=" + apiKey + "&q=" + city;
        URL jsonURL = null;
        try {
            jsonURL = new URL(finalURL);
            ObjectMapper objectMapper = new ObjectMapper();
            Weather weather = objectMapper.readValue(jsonURL, Weather.class);
            System.out.println("Tempteratura w " + city + " wynosi: " + weather.getCurrent().getTemp_c() + " stopni");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
