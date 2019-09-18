package model;

import java.util.List;

public class Data {
	private List<Request> request;
	private List<Current_condition> current_condition;
	private List<Weather> weather;
	public Data() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Data(List<Request> request, List<Current_condition> current_condition, List<Weather> weather) {
		super();
		this.request = request;
		this.current_condition = current_condition;
		this.weather = weather;
	}
	public List<Request> getRequest() {
		return request;
	}
	public void setRequest(List<Request> request) {
		this.request = request;
	}
	public List<Current_condition> getCurrent_condition() {
		return current_condition;
	}
	public void setCurrent_condition(List<Current_condition> current_condition) {
		this.current_condition = current_condition;
	}
	public List<Weather> getWeather() {
		return weather;
	}
	public void setWeather(List<Weather> weather) {
		this.weather = weather;
	}
	@Override
	public String toString() {
		return "Data [request=" + request + ", current_condition=" + current_condition + ", weather=" + weather + "]";
	}
	
}
