package model;

import com.google.gson.annotations.SerializedName;

public class Result {
	@SerializedName("data") // Nombre oficial
	private Data data; // Nombre nuestro

	public Result() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Result(Data data) {
		super();
		this.data = data;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Result [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	

}
