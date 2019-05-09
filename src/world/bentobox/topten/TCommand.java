package world.bentobox.topten;

import java.util.List;

import world.bentobox.bentobox.api.commands.CompositeCommand;
import world.bentobox.bentobox.api.user.User;

public class TCommand extends CompositeCommand {
	private TopTen addon;

	public TCommand(TopTen addon, CompositeCommand parent) {
		super(addon, parent, "toptenheads", "topleaderboard", "headleaderboard", "topheads", "islandleaderboard");
		this.addon = addon;
	}

	public TCommand(TopTen addon) {
		super(addon, "toptenheads", "topheads", "tth", "topleaderboard");
		this.addon = addon;


	}

	@Override
	public void setup() {
		setDescription("info about the island leaderboard.");
		setOnlyPlayer(true);
		this.setPermission("bskyblock.topten");

	}

	@Override
	public boolean execute(User user, String label, List<String> args) {
		return false;
	}

}
