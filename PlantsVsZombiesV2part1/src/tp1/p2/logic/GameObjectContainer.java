package tp1.p2.logic;

import java.util.ArrayList;
import java.util.List;

import tp1.p2.logic.gameobjects.GameObject;

public class GameObjectContainer {
	
	GameObject gameObject;
	
	private List<GameObject> gameObjects;

	public GameObjectContainer() {
		gameObjects = new ArrayList<>();
	}

	public void add(GameObject go) 
	{
		gameObjects.add(go);
		go.onEnter();
	}
	
	public boolean isPositionEmpty(int col, int row)
	{
		//buscar en la lista el lugar
		
		
		return gameObjects.isEmpty(); //ver como funciona
	}
	
	public void update()
	{
		for (GameObject g : gameObjects)
		{
			if (g.isAlive()) g.update();
		}
	}
	
	public void clear()
	{
		gameObjects.clear();
	}
	
	public boolean removeDead() 
	{
		boolean ok = false;
		for (GameObject go : gameObjects) 
		{
			if (!go.isAlive()) 
			{
				go.onExit(); 
				ok = true;
			}
		}
		return ok;
	}
	
	public GameItem getGameItemInPosition(int col, int row)
	{
		//System.out.println(gameObjects.size());
		for(int i=0;i<gameObjects.size();i++) 
		{					
			if(gameObjects.get(i).isInPosition(col, row))
			{			
					return gameObjects.get(i);			
			}			
		}
		return null;
		
	}
	
	public String positionToString(int col, int row)
	{
		GameItem go = getGameItemInPosition(col, row); 
		if(null==go) 
		{
			return "";
		}
		return go.toString();
	}
	
}
