package classes.user;

import java.util.ArrayList;

import classes.game.Game;
import exceptions.InvalidValueException;

public abstract class User {
	protected String name;
	protected String id;
	protected ArrayList<Game> games;
	protected double cash;
	protected int x2p;
	
	public User(String name, String id) throws Exception {
		if (name == null || id == null) throw new NullPointerException();
		if (name == "" || id == "") throw new InvalidValueException();
		
		this.name = name;
		this.id = id;
		this.cash = 0;
	}
	
	public abstract boolean buyGame(Game g);
	
	public boolean regMove(String gameName, int score, boolean finished) throws Exception {
		if (gameName == null) throw new NullPointerException();
		
		for (Game g : games) {
			if (g.getName().equals(gameName)){
				x2p += g.regMove(score, finished);
				return true;
			}
		}		
		
		return false;
	}

	public String getId() {
		return id;
	}
	
	public void setCash(double cash) throws InvalidValueException {
		if (cash <= 0) throw new InvalidValueException();
		this.cash = cash;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (! (obj instanceof User)) return false;		
		User temp_obj = (User) obj;	
		
		return this.id.equals(temp_obj.getId());
	}
}
