import java.awt.Color;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridWorld {
	public static void main(String[] args) {
		World world = new World();
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				Flower flow = new Flower();
				Location location = new Location(i, j);
				world.add(location, flow);
			}
		}
		Flower flower = new Flower();
		Bug bug = new Bug();
		Bug bug2 = new Bug();
		Flower flower2 = new Flower();
		world.show();
		bug2.setColor(Color.BLUE);
		bug2.turn();
		Location location4 = new Location(5, 1);
		Location location3 = new Location(7, 6);
		Location location2 = new Location(4, 3);
		Location location = new Location(5, 5);
		world.add(location2, bug2);
		world.add(location, bug);
		world.add(location3, flower);
		world.add(location4, flower2);

	}

}
