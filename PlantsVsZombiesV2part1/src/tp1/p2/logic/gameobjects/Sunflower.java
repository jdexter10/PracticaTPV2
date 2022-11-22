package tp1.p2.logic.gameobjects;

import  tp1.p2.view.Messages;

public class Sunflower extends Plant {
	
	private static final int COST=20;
	private static final int DAMAGE=0;
	private static final int ENDURANCE=1;
	
	Sunflower(){
		
	}

	@Override
	public String getName() {
		return Messages.SUNFLOWER_NAME;
	}

	@Override
	public int getCost() {
		return COST;
		
	}

	@Override
	public void copy() {
		
	}

	@Override
	public void update() {
		
		
	}

	@Override
	protected String getSymbol() {
		return Messages.SUNFLOWER_SYMBOL;
	}

	@Override
	public String getDescription() {
		return Messages.plantDescription(Messages.SUNFLOWER_NAME_SHORTCUT, COST, DAMAGE, ENDURANCE);
	}

	
	
}
