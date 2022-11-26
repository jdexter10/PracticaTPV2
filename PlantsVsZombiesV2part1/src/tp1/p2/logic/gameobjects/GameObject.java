package tp1.p2.logic.gameobjects;

import static tp1.p2.view.Messages.status;

import tp1.p2.logic.GameItem;
import tp1.p2.logic.GameWorld;
import tp1.p2.view.Messages;

/**
 * Base class for game non playable character in the game.
 *
 */
public abstract class GameObject implements GameItem {
	
	protected static final int COOLDOWN=3;

	protected GameWorld game;

	protected int col;

	protected int row;
	
	protected int lives;
	
	
	GameObject()
	{
		
	}

	GameObject(GameWorld game, int col, int row) {
		this.game = game;
		this.col = col;
		this.row = row;
	}

	public boolean isInPosition(int col, int row) {
		return this.col == col && this.row == row;
	}

	public int getCol() {
		return col;
	}

	public int getRow() {
		return row;
	}
	
	abstract public boolean isAlive();

	public String toString(int col, int row) {
		if (isInPosition(col, row)) {
			return Messages.GAME_OBJECT_STATUS;
		} else {
			return "";
		}
	}
	
	
	public void recieveDamage(int damage)
	{
		this.lives -= damage;
	}
	
	protected void kill() // no se si hay que poner esta funcion mejor tenerla
	{
		this.lives = 0;
	}

	abstract protected String getSymbol();

	abstract public void update();
	
	abstract public void onEnter();
	
	abstract public void onExit();
	
	abstract public boolean receiveZombieAttack(int damage);
	
	abstract public boolean receivePlantAttack(int damage);
	
	abstract public boolean isNpc();
	
	abstract public String getDescription();
}
