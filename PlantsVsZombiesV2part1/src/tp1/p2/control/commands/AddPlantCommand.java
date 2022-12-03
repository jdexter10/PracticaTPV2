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
		else if(plantName == Messages.SUNFLOWER_NAME)	consumeCoins = game.tryToBuy(20); //revisar como conseguir los suncoins dependiendo de la planta
		//if(consumeCoins) game.addGameObject();
		return new ExecutionResult(Messages.COMMAND_NONE_NAME); //ver que retornar sino
	}

	@Override
	public Command create(String[] parameters) {
		AddPlantCommand ret=null;
		String planta = null;
		int col = 0, row = 0;

		
		if(parameters.length<4) 
		{
			
			System.out.println(error(Messages.COMMAND_PARAMETERS_MISSING));
			
		}
		else 
		{
	

			 planta=parameters[1];
			 col=Integer.parseInt(parameters[2]);
			 row=Integer.parseInt(parameters[3]);
			
		}
		if(Character.isDigit(col) && Character.isDigit(row) ) 
		{
			
			System.out.println(error(Messages.INVALID_COMMAND));
		}
		else 
		{
			try 
			{
				ret= new AddPlantCommand(true);
				this.col=col;
				this.row=row;
				this.plantName=planta;
				ret = (AddPlantCommand)this.clone();
			} 	
			catch (CloneNotSupportedException e) 
			{
				System.out.println(error(Messages.INVALID_COMMAND));
				e.printStackTrace();
			}
		}
		return ret;
	}
}
