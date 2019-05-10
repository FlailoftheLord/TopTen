package world.bentobox.topten.listeners;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import world.bentobox.level.event.IslandLevelCalculatedEvent;
import world.bentobox.topten.TopTen;
import world.bentobox.topten.dataHandler.Leaderboard;

public class IslandLevelUpdate implements Listener {
	private TopTen addon = TopTen.addon;

	@EventHandler
	public void levelUpdate(IslandLevelCalculatedEvent event) {
		if (event.getIsland() != null) {
			World world = event.getLocation().getWorld();
			new Leaderboard(world, new Location[] {})
			.update(addon.levelAddon.getTopTen().getTopTenList(world));
		}

	}

}
