package world.bentobox.topten.dataHandler;

import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.World;

import world.bentobox.bentobox.database.objects.DataObject;
import world.bentobox.level.objects.TopTenData;

public class Leaderboard implements  DataObject{
	private Location[] signs;
	private String uuid;

	public Leaderboard(World islandWorld, Location[] signLocations) {
		this.setUniqueId(uuid);
		signs = signLocations;
	}

	/**
	 * Get the location of whichever sign board you want.
	 * Initial index is 1.
	 * 
	 * @param index
	 * @return the {@link Location} of the sign if found, null otherwise.
	 */
	public Location get(int index) {
		if (index < signs.length) {
			return signs[index - 1];
		}
		return null;
	}

	public void update(TopTenData data) {
		for (UUID id : data.getTopTen().keySet()) {

		}

	}

	@Override
	public String getUniqueId() {
		return uuid;
	}

	@Override
	public void setUniqueId(String uniqueId) {
		uuid = uniqueId;
	}

}
