package tp1.p2.logic.gameobjects;

import java.util.Arrays;

import java.util.List;

public class ZombieFactory {
	
	private static final List<Zombie> AVAILABLE_ZOMBIES = Arrays.asList(
			new Zombie()
			);
	
	
	
	public static Object getAvailableZombies() {
		return AVAILABLE_ZOMBIES.size();
		//return null;
	}

	public static Object isValidZombie() {
		
		return null;
	}
	
	
	private ZombieFactory()
	{
		
	}

}
