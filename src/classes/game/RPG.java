package classes.game;

public class RPG extends Game{
	public RPG(String name, double cost) throws Exception {
		super(name, cost);
	}

	public int regMove(int score, boolean finished) throws Exception {
		super.regMove(score, finished);
		
		return 10;
	}
}
