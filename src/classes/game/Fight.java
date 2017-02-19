package classes.game;

public class Fight extends Game{
	public Fight(String name, double cost) throws Exception {
		super(name, cost);
	}

	public int regMove(int score, boolean finished) throws Exception {
		super.regMove(score, finished);
		
		return 15;
	}
}
