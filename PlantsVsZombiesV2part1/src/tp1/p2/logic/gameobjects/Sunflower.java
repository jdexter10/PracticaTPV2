package tp1.p2.logic.gameobjects;

import  tp1.p2.view.Messages;

public class Sunflower extends Plant {
	
	private static final int COST=4;
	
	Sunflower(){
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void getCost() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void copy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getSymbol() {
		// TODO Auto-generated method stub
		return Messages.SUNFLOWER_SYMBOL;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return Messages.plantDescription(Messages.SUNFLOWER_NAME_SHORTCUT, this.getCost(), col, COOLDOWN);
	}

	
	
}
