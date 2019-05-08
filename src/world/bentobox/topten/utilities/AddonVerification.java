package world.bentobox.topten.utilities;

import java.util.List;

import world.bentobox.bentobox.api.addons.GameModeAddon;
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
					new TCommand(addon, gm.getPlayerCommand().get()).setup();
				}

			}

			return true;
		}

		return false;
	}

}
