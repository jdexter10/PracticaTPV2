package tp1.p2.logic.gameobjects;

import tp1.p2.logic.GameWorld;
import tp1.p2.view.Messages;

public class Peashooter extends Plant{
	
	private static final int COST = 50;
	private static final int ENDURANCE = 1;
	private static final int DAMAGE = 1;
	
	
	Peashooter()
	{
		
	}

	@Override
	public String getName() {
		return Messages.PEASHOOTER_NAME;
	}


	@Override
	public int getCost() {
		return COST;
		
	}


	@Override
	public void copy() {
		
		
	}


	@Override
	public boolean isAlive() {
		if(Peashooter.this.lives > 0) return true;
		return false;
	}


	@Override
	protected String getSymbol() {
		return Messages.PEASHOOTER_SYMBOL;
	}


	@Override
	public String getDescription() {
		return Messages.PLANT_DESCRIPTION;
	}


	@Override
	public void update() {
		
		for(int i = 0; i < GameWorld.NUM_COLS; i++)
		{
			game.attackZombie(i, this.row, DAMAGE);
		}
	}



}
