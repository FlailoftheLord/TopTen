package world.bentobox.topten.utilities;

import world.bentobox.topten.TopTen;

public class Logger {
	private TopTen addon;

	public Logger(TopTen addon) {
		this.addon = addon;
	}

	public void console(String string) {
		addon.pluginLogger.info("[TopTenHeads] " + string);
	}

	public void warning(String string) {
		addon.pluginLogger.warning("[TopTenHeads] " + string);
	}

}
