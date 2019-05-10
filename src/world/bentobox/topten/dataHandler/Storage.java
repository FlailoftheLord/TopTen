package world.bentobox.topten.dataHandler;

import java.util.LinkedList;
import java.util.List;

import world.bentobox.bentobox.database.Database;
import world.bentobox.topten.TopTen;

public class Storage {
	private final Database<Leaderboard> database;
	private final List<Leaderboard> cache;

	public Storage(TopTen addon) {
		database = new Database<>(addon, Leaderboard.class);
		cache = new LinkedList<>();
	}

}
