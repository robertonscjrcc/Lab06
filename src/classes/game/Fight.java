package classes.game;

import exceptions.EmptyParameterException;

public class Fight extends Game{
	public Fight(String name, double cost) throws Exception {
		super(name, cost);
	}

	public int regMove(int score, boolean finished) throws Exception {
		if (score < 0) throw new EmptyParameterException();
		
		if (finished) this.finished++;
		if (score > this.score) this.score = score;
		
		return 15;
	}
}
