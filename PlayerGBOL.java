package com.TcsProbs;

public class PlayerGBOL {
	int playerId;
	String skill;
	String level;
	int points;
	PlayerGBOL(int pid,String sk,String lvl,int pts)
	{
		this.playerId=pid;
		this.skill=sk;
		this.level=lvl;
		this.points=pts;
	}
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	
}
