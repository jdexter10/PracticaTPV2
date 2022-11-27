package tp1.p2.logic.gameobjects;

import tp1.p2.logic.GameWorld;

public abstract class Plant extends GameObject {
	
	protected Plant(/*int col, int row, int lives, GameWorld game*/)
	{
		/*this.game = game;
		this.col = col;
		this.row = row;
		this.lives = lives;*/
	}
	
	
	abstract public String getName();
	
	abstract public int getCost();
	
	abstract public void copy();
	
	abstract public void update();


	@Override
	public boolean receiveZombieAttack(int damage) {
		boolean ok = false;
		return ok;
	}


	@Override
	public boolean receivePlantAttack(int damage) {
		return false;
	}


	@Override
	public boolean isAlive() {
		if(this.lives > 0) return true;
		return false;
	}


	@Override
	public void onEnter() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void onExit() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public boolean isNpc() {
		// TODO Auto-generated method stub
		//duda que hacer
		return false;
	}


}
