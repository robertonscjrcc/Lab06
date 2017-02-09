package classes.user;

import java.util.ArrayList;

import classes.game.Game;
import exceptions.EmptyParameterException;

public abstract class User {
	protected String name;
	protected String id;
	protected ArrayList<Game> games;
	protected double cash;
	protected int x2p;
	
	public User(String name, String id) throws Exception {
		if (name == null || id == null) throw new NullPointerException();
		if (name == "" || id == "") throw new EmptyParameterException();
		
		this.name = name;
		this.id = id;
		this.cash = 0;
	}
	
	public abstract boolean buyGame(Game g);
	
	public void regMove(String s, int score, boolean finished) throws Exception {
		for (Game g : games) {
			if (g.getName().equals(s)) x2p += g.regMove(score, finished);
		}
	}

	public String getId() {
		return id;
	}
	
	public void setCash(double cash) {
		this.cash = cash;
	}
}
