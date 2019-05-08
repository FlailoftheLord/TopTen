package world.bentobox.topten.dataHandler;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import world.bentobox.bentobox.database.Database;
import world.bentobox.topten.TopTen;

public class Storage {
	private final Database<IslandLevel> database;
	private final Map<UUID, IslandLevel> cache;

	public Storage(TopTen addon) {
		database = new Database<>(addon, IslandLevel.class);
		cache = new HashMap<>();
	}

}
