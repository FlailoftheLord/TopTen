package world.bentobox.topten.utilities;

import java.util.List;

import world.bentobox.bentobox.api.addons.GameModeAddon;
import world.bentobox.bentobox.api.commands.CompositeCommand;
import world.bentobox.topten.TCommand;
import world.bentobox.topten.TopTen;

public class AddonVerification {
	private TopTen addon;

	public AddonVerification(TopTen addon) {
		this.addon = addon;
	}

	public boolean setup() {
		List<GameModeAddon> gamemodeAddons = addon.manager.getGameModeAddons();
		if (gamemodeAddons.size() > 0) {
			for (GameModeAddon gm : gamemodeAddons) {
				if (gm.getPlayerCommand().isPresent()) {
					CompositeCommand gmCmd = gm.getPlayerCommand().get();
					new TCommand(addon, gmCmd).setup();

					addon.logger.console("Found Gamemode addon: " + gm.getDescription().getName());

					continue;
				}

			}

			return true;
		}

		return false;
	}

}
