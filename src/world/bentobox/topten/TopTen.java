package world.bentobox.topten;

import world.bentobox.bentobox.api.addons.Addon;
import world.bentobox.bentobox.managers.AddonsManager;
import world.bentobox.topten.utilities.AddonVerification;

public class TopTen extends Addon {

	public AddonsManager manager;

	@Override
	public void onEnable() {
		manager = getPlugin().getAddonsManager();
		if (!new AddonVerification(this).setup()) {

		}

	}

	@Override
	public void onDisable() {

	}



}
