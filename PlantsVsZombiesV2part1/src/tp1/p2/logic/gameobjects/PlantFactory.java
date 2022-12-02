package tp1.p2.logic.gameobjects;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import tp1.p2.logic.gameobjects.Sunflower;
import tp1.p2.view.Messages;
import tp1.p2.logic.gameobjects.Peashooter;

import tp1.p2.logic.GameWorld;

public class PlantFactory {
	
	Peashooter peashooter;
	Sunflower sunflower;
	
	
	/* @formatter:off */
	private static List<Plant> AVAILABLE_PLANTS = Arrays.asList(
		new Sunflower(),
		new Peashooter()
	);
	/* @formatter:on */

	public static boolean isValidPlant(String plantName) {
		for (Plant p : AVAILABLE_PLANTS) {
			
		}

		return false;
	}

	public static Plant spawnPlant(String plantName, GameWorld game, int col, int row) {
		//Buscar tipo de planta y llamar al copy de ella (devuelve una planta nueva)
		if(plantName == Messages.PEASHOOTER_NAME)
		{
			//peashooter.copy();
		}
		else if(plantName == Messages.SUNFLOWER_NAME)
		{
			
		}
		return null;
	}

	public static List<Plant> getAvailablePlants() {
		return Collections.unmodifiableList(AVAILABLE_PLANTS);
	}

	/*
	 * Avoid creating instances of this class
	 */
	private PlantFactory() {
		
	}
}
