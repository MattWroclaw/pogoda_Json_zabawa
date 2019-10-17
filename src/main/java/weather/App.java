package weather;

import com.google.gson.Gson;
import model.Weather;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class App {

    public static double tempMiasto(String miasto) throws IOException {

        String link = "http://api.openweathermap.org/data/2.5/weather?q="+miasto+"&appid=59b9b107533fda3d0413372a8544f227&units=metric";
        URL url = new URL(link);
        URLConnection urlConnection = url.openConnection();
        Scanner scanner = new Scanner(urlConnection.getInputStream());
        String s = scanner.nextLine();
//        System.out.println(s);
        Gson gson = new Gson();
        Weather weather = gson.fromJson(s, Weather.class);

         double temp = weather.getMain().temp;
         return temp;
//        System.out.println("Temperatura w "+miasto+ ": "+weather.getMain().temp);
    }

}
