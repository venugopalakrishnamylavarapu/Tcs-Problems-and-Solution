package com.TcsProbs;

public class MovieFABD {
	int movieId;
	String director;
	int rating;
	int budget;
	MovieFABD(int mId,String dir,int r,int bud)
	{
		this.movieId=mId;
		this.director=dir;
		this.rating=r;
		this.budget=bud;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public int getBudget() {
		return budget;
	}
	public void setBudget(int budget) {
		this.budget = budget;
	}
}
