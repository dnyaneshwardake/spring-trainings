package com.test.firstapp.propertiesfileuse;

public class ConnectionDetails {
	private String user;
	private String pass;
	private String db;
	private String url;

	public ConnectionDetails() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ConnectionDetails [user=" + user + ", pass=" + pass + ", db=" + db + ", url=" + url + "]";
	}

	public ConnectionDetails(String user, String pass, String db, String url) {
		super();
		this.user = user;
		this.pass = pass;
		this.db = db;
		this.url = url;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getDb() {
		return db;
	}

	public void setDb(String db) {
		this.db = db;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
