package world.bentobox.topten;

import java.util.List;

import world.bentobox.bentobox.api.commands.CompositeCommand;
import world.bentobox.bentobox.api.user.User;

public class TCommand extends CompositeCommand {
	private TopTen addon;

	public TCommand(TopTen addon, CompositeCommand parent) {
		super(addon, parent, "topten", "topislands", "top");

		this.addon = addon;
	}

	@Override
	public void setup() {
		setDescription("info about the island leaderboard.");
		setOnlyPlayer(true);
		this.setPermission("island.topten");
	}

	@Override
	public boolean execute(User user, String label, List<String> args) {
		return false;
	}

}
