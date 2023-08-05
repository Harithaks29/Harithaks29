package com.asir;

public class MovieRental {
	private int id;
	private String username;
	private int date;
	Movies movie;

	 public MovieRental(int id,String username,int date ) {
		 this.id=id;
		 this.username=username;
		 this.date=date;
	 }
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Movies getMovie() {
		return movie;
	}

	public void setMovie(Movies movie) {
		this.movie = movie;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getDate() {
		return date;
	}


	public void setDate(int date) {
		this.date = date;
	}
}
