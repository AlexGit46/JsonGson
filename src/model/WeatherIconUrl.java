package model;

public class WeatherIconUrl {
	private String value;

	public WeatherIconUrl() {
		super();
		// TODO Auto-generated constructor stub
	}
	public WeatherIconUrl(String value) {
		super();
		this.value = value;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "WeatherIconUrl [value=" + value + "]";
	}
}
