package world.bentobox.topten.dataHandler;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import world.bentobox.bentobox.database.Database;
import world.bentobox.topten.TopTen;

public class Storage {
	private final Database<IslandLeaderboard> database;
	private final Map<UUID, IslandLeaderboard> cache;

	public Storage(TopTen addon) {
		database = new Database<>(addon, IslandLeaderboard.class);
		cache = new HashMap<>();
	}

}
