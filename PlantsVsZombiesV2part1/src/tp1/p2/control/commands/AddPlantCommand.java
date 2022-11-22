package tp1.p2.control.commands;

import static tp1.p2.view.Messages.error;

import tp1.p2.control.Command;
import tp1.p2.control.ExecutionResult;
import tp1.p2.logic.GameWorld;
import tp1.p2.logic.gameobjects.Plant;
import tp1.p2.logic.gameobjects.PlantFactory;
import tp1.p2.view.Messages;

public class AddPlantCommand extends Command implements Cloneable {

	private int col;

	private int row;

	private String plantName;

	private boolean consumeCoins; // boolean para saber si una planta cuesta monedas o no

	public AddPlantCommand() {
		this(true);
	}

	public AddPlantCommand(boolean consumeCoins) {
		this.consumeCoins = consumeCoins;
	}

	@Override
	protected String getName() {
		return Messages.COMMAND_ADD_NAME;
	}

	@Override
	protected String getShortcut() {
		return Messages.COMMAND_ADD_SHORTCUT;
	}

	@Override
	public String getDetails() {
		return Messages.COMMAND_ADD_DETAILS;
	}

	@Override
	public String getHelp() {
		return Messages.COMMAND_ADD_HELP;
	}

	@Override
	public ExecutionResult execute(GameWorld game) {
		if(game.isPositionEmpty(col, row)) return new ExecutionResult(Messages.COMMAND_INCORRECT_PARAMETER_NUMBER);
		if(game.isValidPlantPosition(col, row)) return new ExecutionResult(Messages.INVALID_POSITION);
		PlantFactory.spawnPlant(plantName, game, col, row);
		if(plantName == Messages.PEASHOOTER_NAME)	consumeCoins = game.tryToBuy(50);
		else if(plantName == Messages.PEASHOOTER_NAME)	consumeCoins = game.tryToBuy(20); //revisar como conseguir los suncoins dependiendo de la planta
		if(consumeCoins) game.addGameObject();
		return null; //ver que retornar sino
	}

	@Override
	public Command create(String[] parameters) {
		parameters[0] = plantName;
		parameters[1] = Integer.toString(col);
		parameters[2] = Integer.toString(row); //try catch
		if(parameters.length == 3);
		if(col == Integer.parseInt(parameters[1]));
		if(!PlantFactory.isValidPlant(plantName));
		return null;
	}

}
