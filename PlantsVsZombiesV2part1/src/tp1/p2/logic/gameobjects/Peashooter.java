package tp1.p2.logic.gameobjects;

import tp1.p2.view.Messages;

public class Peashooter {
	
	private static final int COST = 50;
	private static final int ENDURANCE = 1;
	private static final int DAMAGE = 1;
	
	
	@Override
	protected String getDescription() { //ver como va lo de override
		return Messages.plantDescription(Messages.PEASHOOTER_NAME , DAMAGE, ENDURANCE);
	}
}
