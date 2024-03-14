package fc.java.course2.part3;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WeatherExample {
    public static void main(String[] args) {

        String apiKey = "9755230bb26d767b92f7f7525f6ed9fc";
        String lat = "37";
        String lon = "126";
        String urlString = "https://api.openweathermap.org/data/2.5/weather?lat=" + lat + "&lon=" + lon + "&appid=" + apiKey;

        try {
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Accept", "application/json");

            int responseCode = connection.getResponseCode();
            System.out.println("responseCode = " + responseCode);


            BufferedReader bf = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            String inputLine;
            StringBuilder sb = new StringBuilder();

            while ((inputLine = bf.readLine()) != null) {
                sb.append(inputLine);
            }

            bf.close();

            JsonObject weatherData = JsonParser.parseString(bf.toString()).getAsJsonObject();
            JsonObject mainData = weatherData.getAsJsonObject("main");
            double temp = mainData.get("temp").getAsDouble();

            System.out.println("temp = " + temp);


            connection.disconnect();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
