package classes.user;

import classes.game.Game;

public class Noob extends User{

	public Noob(String name, String id) throws Exception {
		super(name, id);
		this.x2p = 0;
	}

	public boolean buyGame(Game g) {
		if (g == null) throw new NullPointerException();
		
		if (this.cash - g.getCost() * 0.9 >= 0){
			games.add(g);
			this.cash -= g.getCost() * 0.9;
			this.x2p += (10 * g.getCost());
			return true;
		}
		
		return false;
	}	
}
