package tp1.p2.logic;

import java.util.Random;

import tp1.p2.control.Level;
import tp1.p2.logic.gameobjects.Zombie;
import tp1.p2.logic.gameobjects.ZombieFactory;

/**
 * Manage zombies in the game.
 *
 */
public class ZombiesManager {

	private GameWorld game;

	private Level level;

	private Random rand;

	private int remainingZombies;
	
	private int zombiesAlived = 0;

	public ZombiesManager(GameWorld game, Level level, Random rand) {
		this.game = game;
		this.level = level;
		this.rand = rand;
		this.remainingZombies = level.getNumberOfZombies();
		this.zombiesAlived = 0;
	}

	/**
	 * Checks if the game should add (if possible) a zombie to the game.
	 * 
	 * @return <code>true</code> if a zombie should be added to the game.
	 */
	private boolean shouldAddZombie() {
		return rand.nextDouble() < level.getZombieFrequency();
	}

	/**
	 * Return a random row within the board limits.
	 * 
	 * @return a random row.
	 */
	private int randomZombieRow() {
		return rand.nextInt(GameWorld.NUM_ROWS);
	}

	private int randomZombieType() {
		//return rand.nextInt(ZombieFactory.getAvailableZombies().size());
		return 1;
	}


	public void update() {
		if(addZombie())
		{
			this.remainingZombies--;
		}
	}

	public boolean addZombie() {
		int row = randomZombieRow();
		return addZombie(row);
	}

	public boolean addZombie(int row) {
		boolean canAdd = getRemainingZombies() > 0 && shouldAddZombie() && isPositionEmpty(GameWorld.NUM_COLS, row);
		int zombieType = randomZombieType();

		if (canAdd) 
		{
			//Se obtiene un número random
			int rndm = (int) (Math.random()* 100);
			//Se obtiene un número entre 0 y 3 que será el id del zombie
			int zombieIdx = rndm % 4;
			//Se crea un zombie
			Zombie zombie = ZombieFactory.spawnZombie(zombieIdx,game, Game.NUM_COLS, row);
			//Se añade al juego
			game.addGameObject(zombie);
			//Se resta de los zombies que quedan por salir
			remainingZombies--;
			//Se suman a los zombies que han entrado al campo
			//currentZombies++;
			zombiesAlived++;
		}
		return canAdd;
	}

	public int getRemainingZombies() {
		return this.remainingZombies;
	}
	
	public boolean allZombiesDied()
	{
		if(this.remainingZombies == this.zombiesAlived && zombiesAlived == 0) return true;
		return false;
	}
	
	public boolean zombieDied()
	{
		return game.ZombieDied();
	}
	
	private boolean isPositionEmpty(int numCols, int row) {
		if(game.isPositionEmpty(numCols, row)) return true;
		return false;
	}

}
