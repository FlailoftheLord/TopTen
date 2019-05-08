package world.bentobox.topten.dataHandler;

import world.bentobox.bentobox.api.user.User;
import world.bentobox.bentobox.database.objects.DataObject;
import world.bentobox.bentobox.database.objects.Island;

public class IslandLevel implements DataObject {
	private String uuid;

	private User user;
	private Island island;
	private int level;

	@Override
	public String getUniqueId() {
		return uuid;
	}

	@Override
	public void setUniqueId(String uniqueId) {
		uuid = uniqueId;
	}

}
