package tp1.p2.logic;

public interface GameStatus {

	int getCycle();

	int getSuncoins();
	
	int getRemainingZombies();
	
	int positionToString();
	
	boolean isPlayerQuits();
	
	boolean isPlayerDied();
	
	boolean allZombiesDied();

	public String positionToString(int col, int row);

	// TODO add your code here

}
