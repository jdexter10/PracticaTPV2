package tp1.p2.logic;

public interface GameStatus {

	public int getCycle();

	public int getSuncoins();
	
	public int getRemainingZombies();
	
	public String positionToString(int col, int row);
	
	public boolean isPlayerQuits();
	
	public boolean isPlayerDied();
	
	public boolean allZombiesDied();
}
