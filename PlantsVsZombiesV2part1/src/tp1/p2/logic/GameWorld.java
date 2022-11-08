package tp1.p2.logic;

import tp1.p2.control.Command;
import tp1.p2.control.ExecutionResult;
import tp1.p2.control.Level;
import tp1.p2.logic.actions.GameAction;
import tp1.p2.logic.gameobjects.GameObject;

public interface GameWorld {

	public static final int NUM_ROWS = 4;

	public static final int NUM_COLS = 8;

	// TODO add your code here
	public boolean playerQuits();
	
	public void update();
	
	public void reset();
	
	public void reset();
	
	public boolean isPositionEmpty();
	
	public void attackPlant();
	
	public void attackZombie();
	
	public void addSuncoins();
	
	public void addGameObject();
	
	public boolean tryToBuy(int suncoins);
	
	public boolean ZombieArrived();
	
	public boolean ZombieDied();
	
	public boolean isValidPlantPosition();
	
	public boolean isValidZombiePosition();
}
