package tp1.p2.logic;

import java.util.Random;

import tp1.p2.control.Command;
import tp1.p2.control.Level;

public class Game {
	
	private static final int INITIAL_SUNCOINS = 50;
	
	private boolean playerQuits;
	
	private long seed;
	
	private Level level;
	
	private int cycle;
	
	private Random rand; // ver que haCER
	
	private int suncoins;
	
	private ZombiesManager zombiesManager;
	
	private GameObjectContainer container;
	
	private boolean playerDied;
	
	
	public Game(long seed, Level level)
	{
		
	}


	public boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}


	public boolean isPlayerQuits() {
		// TODO Auto-generated method stub
		return false;
	}


	public boolean execute(Command command) { // revisar esta funcion
		// TODO Auto-generated method stub
		return false;
	}
	
	//Seguir
	
}
