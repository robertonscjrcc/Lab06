package classes.game;

import java.util.ArrayList;
import enums.GameStyle;
import exceptions.EmptyParameterException;

public abstract class Game {
	private String name;
	private ArrayList<String> style;
	private double cost;	
	protected int score;
	protected int played;
	protected int finished;
	
	public Game(String name, double cost) throws Exception{
		if (name == null) throw new NullPointerException();
		if (name == "" || cost < 0) throw new EmptyParameterException();
		
		this.name = name;
		this.cost = cost;
		this.score = 0;
		this.played = 0;
		this.finished = 0;
	}
	
	public void addStyle(GameStyle gs){
		this.style.add(gs.toString());
	}

	public abstract int regMove(int score, boolean finished) throws Exception;
	
	public String getName() {
		return name;
	}
	
	public double getCost() {
		return cost;
	}

	public int getPlayed() {
		return played;
	}
	
	public int getFinished() {
		return finished;
	}
	
	public int getScore() {
		return score;
	}
}
