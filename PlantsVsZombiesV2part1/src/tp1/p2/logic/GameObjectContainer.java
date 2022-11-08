package tp1.p2.logic;

import java.util.ArrayList;
import java.util.List;

import tp1.p2.logic.gameobjects.GameObject;

public class GameObjectContainer {

	private List<GameObject> gameObjects;

	public GameObjectContainer() {
		gameObjects = new ArrayList<>();
	}

	public void add()
	{
		
	}
	
	public boolean isPositionEmpty(int col, int row)
	{
		//buscar en la lista el lugar
		
		
		return gameObjects.isEmpty(); //ver como funciona
	}
	
	public void update()
	{
		
	}
	
	public void clear()
	{
		
	}
	
	public boolean removeDead()
	{
		
		return false;
	}
}
