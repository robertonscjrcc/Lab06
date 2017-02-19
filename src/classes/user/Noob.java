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
	
	@Override
	public String toString() {
		int tempCost = 0;
		
		String temp = "User: " + name + System.lineSeparator() 
		            + "Id: " + id + System.lineSeparator() 
		            + "Cash: " + cash + System.lineSeparator();
		
		temp += "Lista de Jogos: " + System.lineSeparator();
		
		for (Game g : games) {
			temp += "+ " + g.getName() + "-" + g.getClass().getName() + System.lineSeparator();
			temp += "===> Jogou " + g.getPlayed() + " vez(es)" + System.lineSeparator();
			temp += "===> Zerou " + g.getFinished() + " vez(es)" + System.lineSeparator();
			temp += "===> Maior score: " + g.getScore() + " vez(es)" + System.lineSeparator();
			tempCost += g.getCost();
		}
		
		temp += "===> Preço jogos: " + tempCost + System.lineSeparator();
		
		return temp;
	}
}
