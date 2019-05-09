package world.bentobox.topten;

import world.bentobox.bentobox.BentoBox;
import world.bentobox.bentobox.api.addons.Addon;
import world.bentobox.bentobox.managers.AddonsManager;
import world.bentobox.level.Level;
import world.bentobox.topten.listeners.IslandLevelUpdate;
import world.bentobox.topten.utilities.AddonVerification;
import world.bentobox.topten.utilities.Logger;

public class TopTen extends Addon {

	public BentoBox plugin;
	public AddonsManager manager;
	public java.util.logging.Logger pluginLogger;
	public Logger logger;

	public String gamemode;
	public Level levelAddon;

	@Override
	public void onEnable() {
		plugin = this.getPlugin();
		manager = getPlugin().getAddonsManager();
		pluginLogger = getLogger();
		logger = new Logger(this);
		if (!new AddonVerification(this).setup()) {
			this.disable();
			return;
		}
		levelAddon = (Level) this.getAddonByName("Level").get();
		logger.console("Level addon found and hookered!");

		registerCommand();

		registerListeners();

	}



	@Override
	public void onDisable() {

	}

	private void registerListeners() {
		this.registerListener(new IslandLevelUpdate());
	}

	private void registerCommand() {
		new TCommand(this).setup();
	}

	private void disable() {
		setState(State.DISABLED);
		logger.warning("You MUST have a bentobox gamemode addon installed!");
		logger.warning("Please install one of the following addons, and restart your server:");
		logger.console("    - BSkyblock");
		logger.console("    - AcidIsland");
	}


}
