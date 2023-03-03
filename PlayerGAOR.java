package com.TcsProbs;

public class PlayerGAOR {
	int id;
	String name;
	int iccRank;
	int matchesPlayed;
	int runsScored;
	PlayerGAOR(int id,String n,int icc,int mp,int rs)
	{
		this.id=id;
		this.name=n;
		this.iccRank=icc;
		this.matchesPlayed=mp;
		this.runsScored=rs;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIccRank() {
		return iccRank;
	}
	public void setIccRank(int iccRank) {
		this.iccRank = iccRank;
	}
	public int getMatchesPlayed() {
		return matchesPlayed;
	}
	public void setMatchesPlayed(int matchesPlayed) {
		this.matchesPlayed = matchesPlayed;
	}
	public int getRunsScored() {
		return runsScored;
	}
	public void setRunsScored(int runsScored) {
		this.runsScored = runsScored;
	}
}
