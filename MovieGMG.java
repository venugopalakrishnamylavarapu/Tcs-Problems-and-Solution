package com.TcsProbs;

public class MovieGMG {
	String movie;
	String company;
	String genre;
	int budget;
	MovieGMG(String mv,String com,String gen,int bud)
	{
		this.movie=mv;
		this.company=com;
		this.genre=gen;
		this.budget=bud;
	}
	public String getMovie() {
		return movie;
	}
	public void setMovie(String movie) {
		this.movie = movie;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getBudget() {
		return budget;
	}
	public void setBudget(int budget) {
		this.budget = budget;
	}

}
