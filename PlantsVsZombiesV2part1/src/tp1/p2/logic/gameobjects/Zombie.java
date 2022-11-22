package tp1.p2.logic.gameobjects;

import tp1.p2.logic.GameWorld;
import tp1.p2.view.Messages;

public class Zombie extends GameObject{
	
	private static final int ENDURANCE = 5;
	private static final int DAMAGE = 1;
	private static final int SPEED = 1;
	
	Zombie()
	{
		
	}
	
	public void copy()
	{
		
	}
	
	public String getName()
	{
		return Messages.ZOMBIE_NAME;
	}
	
	protected int getSpeed()
	{
		return SPEED;
	}
	protected int getDamage()
	{
		return DAMAGE;
	}
	protected int getEndurance()
	{
		return ENDURANCE;
	}
	
	public void update()
	{
		game.attackPlant(this.col-1, this.row, getDamage());
	}

	@Override
	public boolean isAlive() {
		if(this.lives > 0) return true;
		return false;
	}

	@Override
	protected String getSymbol() {
		return Messages.ZOMBIE_SYMBOL;
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
	public boolean receiveZombieAttack(int damage) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean receivePlantAttack(int damage) {
		if(isAlive()) this.lives -= damage;
		return false;
	}

	@Override
	public boolean isNpc() {
		
		return false;
	}

	@Override
	public String getDescription() {
		return null;
	}
}