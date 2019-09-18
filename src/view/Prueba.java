package view;
import java.util.List;

import manejador.Manejador;
import model.Result;
import model.Weather;

public class Prueba {
	public static void main(String[] args) {
		Manejador manejador= new Manejador("http://api.worldweatheronline.com/premium/v1/weather.ashx?key=e32ee1a67c1b493eb9d211214180710&q=Toledo,Spain&num_of_days=10&fx24=yes&lang=es&mca=no&tp=24&format=json");
		Result result = manejador.getResult();
		System.out.println("City: "+result.getData().getRequest().get(0).getQuery());
		System.out.println("Current: ");
		System.out.println(result.getData().getCurrent_condition().get(0).getLang_es().get(0).getValue());
		System.out.println(result.getData().getCurrent_condition().get(0).getWeatherIconUrl().get(0).getValue());
		System.out.println(result.getData().getCurrent_condition().get(0).getTemp_C());
		System.out.println(result.getData().getCurrent_condition().get(0).getPrecipMM());
		List<Weather> weathers = result.getData().getWeather();
		System.out.println("Weathers: ");
		for (Weather weather : weathers){
			System.out.println(weather);
		}
	}
}
