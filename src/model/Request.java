package model;

public class Request {
	private String query;

	public Request() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Request(String query) {
		super();
		this.query = query;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	@Override
	public String toString() {
		return "Request [query=" + query + "]";
	}
	

}
