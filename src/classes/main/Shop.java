package classes.main;

import java.util.ArrayList;

import classes.game.Fight;
import classes.game.Game;
import classes.game.Platform;
import classes.game.RPG;
import classes.user.Noob;
import classes.user.User;
import classes.user.Veteran;
import exceptions.AddWrongTypeException;
import exceptions.InexistentParameterException;

public class Shop {
	private ArrayList<User> users;
	private ArrayList<Game> games;
	
	public Shop() {
		super();
	}
	
	public void addUser(String name, String id, String type) throws Exception {
		if (type.equals("Noob")) this.users.add(new Noob(name, id));
		else if (type.equals("Veteran")) this.users.add(new Veteran(name, id));
		else throw new AddWrongTypeException();
	}
	
	public void addGame(String name, double cost, String type) throws Exception {
		if (type.equals("RPG")) this.games.add(new RPG(name, cost));
		else if (type.equals("Luta")) this.games.add(new Fight(name, cost));
		else if (type.equals("Plataforma")) this.games.add(new Platform(name, cost));
		else throw new AddWrongTypeException();
	}
	
	public boolean addCashToUser(String id, double cash) throws Exception {
		for (User u : users) {
			if (u.getId().equals(id)) {
				u.setCash(cash);
				return true;
			}
		}
		
		return false;
	}
	
	public boolean sellGame(String id, String gameName) throws Exception {
		for (Game g : games) {
			if (g.getName().equals(gameName))
				for (User u : users) {
					if (u.getId().equals(id))
						return u.buyGame(g);
				}
		}	
		
		throw new InexistentParameterException();
	}
	
	public String printUser(String id) {
		return this.getUser(id).toString();
	}
	
	public User getUser(String id) {
		for (User u : users) {
			if (u.getId().equals(id)) return u;
		}
		
		return null;
	}
}
