package classes.user;

import classes.game.Game;

public class Veteran extends User{

	public Veteran(String name, String id) throws Exception {
		super(name, id);
		super.x2p = 1000;
	}

	public boolean buyGame(Game g) {
		if (g == null) throw new NullPointerException();
		
		if (this.cash - g.getCost() * 0.8 >= 0){
			games.add(g);
			this.cash -= g.getCost() * 0.8;
			this.x2p += (15 * g.getCost());
			return true;
		}
		
		return false;
	}	
	
	@Override
	public String toString() {
		return "User: " + id + System.lineSeparator() + "";
	}
}
