package classes;

import enums.GameType;
import exceptions.EmptyParameterException;

public class Game {
	private String name;
	private String type;
	private double cost;	
	private int score;
	private int played;
	private int finished;
	
	public Game(String name, String type, double cost) throws EmptyParameterException, NullPointerException{
		if (name == "" || type == "" || cost < 0) throw new EmptyParameterException();
		if (name == null || type == null) throw new NullPointerException();
		
		this.name = name;
		this.type = type;
		this.cost = cost;
		this.score = 0;
		this.played = 0;
		this.finished = 0;
	}

	public int regMove(int score, boolean finished) {
		if (finished) this.finished++;
		if (score > this.score) this.score = score;

		for (GameType gt : GameType.values())
			if (gt.toString().equals(this.type)) return gt.ordinal();
		
		return -1;
	}
	
	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
}
