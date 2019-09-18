package model;

import java.util.List;

public class Weather {
	private String date;
	private int maxtempC;
	private int mintempC;
	private List<Hourly> hourly;
	public Weather() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Weather(String date, int maxtempC, int mintempC, List<Hourly> hourly) {
		super();
		this.date = date;
		this.maxtempC = maxtempC;
		this.mintempC = mintempC;
		this.hourly = hourly;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getMaxtempC() {
		return maxtempC;
	}
	public void setMaxtempC(int maxtempC) {
		this.maxtempC = maxtempC;
	}
	public int getMintempC() {
		return mintempC;
	}
	public void setMintempC(int mintempC) {
		this.mintempC = mintempC;
	}
	public List<Hourly> getHourly() {
		return hourly;
	}
	public void setHourly(List<Hourly> hourly) {
		this.hourly = hourly;
	}
	@Override
	public String toString() {
		return "Weather [date=" + date + ", maxtempC=" + maxtempC + ", mintempC=" + mintempC + ", hourly=" + hourly
				+ "]";
	}

}
