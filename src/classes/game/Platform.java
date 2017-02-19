package classes.game;

public class Platform extends Game{
	public Platform(String name, double cost) throws Exception {
		super(name, cost);
	}

	public int regMove(int score, boolean finished) throws Exception {
		super.regMove(score, finished);
		
		return 20;
	}
}
