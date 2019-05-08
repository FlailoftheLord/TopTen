package world.bentobox.topten;

import java.util.logging.Logger;

import world.bentobox.bentobox.BentoBox;
import world.bentobox.bentobox.api.addons.Addon;
import world.bentobox.bentobox.managers.AddonsManager;
import world.bentobox.topten.utilities.AddonVerification;

public class TopTen extends Addon {

	public BentoBox plugin;
	public AddonsManager manager;
	public Logger logger;

	@Override
	public void onEnable() {
		plugin = this.getPlugin();
		manager = getPlugin().getAddonsManager();
		logger = getLogger();
		if (!new AddonVerification(this).setup()) {
			this.disable();
			return;
		}


	}

	@Override
	public void onDisable() {

	}

	private void disable() {
		setState(State.DISABLED);
		logger.warning("You MUST have a bentobox gamemode addon installed!");
		logger.warning("Please install one of the following addons, and restart your server:");
		logger.info("    - BSkyblock");
		logger.info("    - AcidIsland");
	}


}
