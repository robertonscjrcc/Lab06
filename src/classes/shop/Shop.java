package classes.shop;

import java.util.ArrayList;

import classes.game.Game;
import classes.user.User;

public class Shop {
	private ArrayList<User> users;
	private ArrayList<Game> games;
	
	public Shop() {
		super();
	}
	
	public void addUser(User u) {
		this.users.add(u);
	}
	
	public void addGame(Game g) {
		this.games.add(g);
	}
	
	public boolean addCashToUser(String id, double cash) {
		for (User u : users) {
			if (u.getId().equals(id)) {
				u.setCash(cash);
				System.out.println("Créditos adicionados com sucesso");
				return true;
			}
		}
		
		System.out.println("Usuário não existe");
		return false;
	}
	
	public boolean sellGame(String id, Game g) {
		for (User u : users) {
			if (u.getId().equals(id)) {
				if (u.buyGame(g)) {
					System.out.println("Jogo comprado com sucesso");
					return true;
				}
				else {
					System.out.println("Usuário não tem crédito suficiente");
					return false;
				}
			}
		}
		
		System.out.println("Usuário não existe");
		return false;
	}
}
