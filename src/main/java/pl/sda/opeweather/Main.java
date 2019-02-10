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


        URL jsonURL = null;
        try {
            jsonURL = new URL("http://api.apixu.com/v1/current.json?key=23f7a82df6764a3986590706191002&q=Bydgoszcz");
            ObjectMapper objectMapper = new ObjectMapper();
            Weather weather = objectMapper.readValue(jsonURL, Weather.class);
            System.out.println(weather);
        } catch (IOException e) {
            e.printStackTrace();
        }




    }
}
