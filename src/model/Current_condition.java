package model;

import java.util.List;

public class Current_condition {
	private int temp_C;
	private List<WeatherIconUrl> weatherIconUrl;
	private List<Lang_es> lang_es;
	private double precipMM;
	public Current_condition() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Current_condition(int temp_C, List<WeatherIconUrl> weatherIconUrl, List<Lang_es> lang_es, double precipMM) {
		super();
		this.temp_C = temp_C;
		this.weatherIconUrl = weatherIconUrl;
		this.lang_es = lang_es;
		this.precipMM = precipMM;
	}
	public int getTemp_C() {
		return temp_C;
	}
	public void setTemp_C(int temp_C) {
		this.temp_C = temp_C;
	}
	public List<WeatherIconUrl> getWeatherIconUrl() {
		return weatherIconUrl;
	}
	public void setWeatherIconUrl(List<WeatherIconUrl> weatherIconUrl) {
		this.weatherIconUrl = weatherIconUrl;
	}
	public List<Lang_es> getLang_es() {
		return lang_es;
	}
	public void setLang_es(List<Lang_es> lang_es) {
		this.lang_es = lang_es;
	}
	public double getPrecipMM() {
		return precipMM;
	}
	public void setPrecipMM(double precipMM) {
		this.precipMM = precipMM;
	}
	@Override
	public String toString() {
		return "Current_condition [temp_C=" + temp_C + ", weatherIconUrl=" + weatherIconUrl + ", lang_es=" + lang_es
				+ ", precipMM=" + precipMM + "]";
	}
}
