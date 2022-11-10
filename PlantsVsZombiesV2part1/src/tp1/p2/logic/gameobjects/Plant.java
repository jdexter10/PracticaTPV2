package tp1.p2.logic.gameobjects;

public abstract class Plant extends GameObject {
	
	protected Plant()
	{
		
	}
	
	
	abstract public String getName();
	
	abstract public void getCost();
	
	abstract public void copy();
	
	abstract public void update();
	
	abstract public String getSymbol();
	
	abstract public String getDescription();


	@Override
	public boolean receiveZombieAttack(int damage) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean receivePlantAttack(int damage) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean isAlive() {
		// TODO Auto-generated method stub
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
