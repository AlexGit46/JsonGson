package model;

import java.util.List;

public class Hourly {
	private List<WeatherIconUrl> weatherIconUrl;
	private List<Lang_es> lang_es;
	private Double precipMM;
	public Hourly() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Hourly(List<WeatherIconUrl> weatherIconUrl, List<Lang_es> lang_es, Double precipMM) {
		super();
		this.weatherIconUrl = weatherIconUrl;
		this.lang_es = lang_es;
		this.precipMM = precipMM;
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
	public Double getPrecipMM() {
		return precipMM;
	}
	public void setPrecipMM(Double precipMM) {
		this.precipMM = precipMM;
	}
	@Override
	public String toString() {
		return "Hourly [weatherIconUrl=" + weatherIconUrl + ", lang_es=" + lang_es + ", precipMM=" + precipMM + "]";
	}

}
