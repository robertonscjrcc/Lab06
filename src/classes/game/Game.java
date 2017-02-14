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
		if (name == null) throw new NullPointerException("Parâmetro nulo");
		if (name == "" || cost < 0) throw new EmptyParameterException("Parâmetro vazio");
		
		this.name = name;
		this.cost = cost;
		this.score = 0;
		this.played = 0;
		this.finished = 0;
	}
	
	public abstract int regMove(int score, boolean finished) throws Exception;
	
	public boolean addStyle(GameStyle gs){
		if (gs == null) throw new NullPointerException();
		
		for (String g : style) {
			if (gs.toString().equals(g)) return false;
		}
		this.style.add(gs.toString());
		
		return true;
	}	
	
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

	@Override
	public String toString() {
		return "Game [name=" + name + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (! (obj instanceof Game)) return false;		
		Game temp_obj = (Game) obj;	
		
		return this.name.equals(temp_obj.getName());
	}
}
