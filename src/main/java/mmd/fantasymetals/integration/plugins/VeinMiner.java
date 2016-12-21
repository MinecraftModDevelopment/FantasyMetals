package mmd.fantasymetals.integration.plugins;

import cyano.basemetals.integration.BaseMetalsPlugin;
import cyano.basemetals.integration.IIntegration;

/**
 * VeinMiner Integration Plugin
 *
 * @author Jasmine Iwanek
 *
 */
@BaseMetalsPlugin(VeinMiner.PLUGIN_MODID)
public class VeinMiner extends cyano.basemetals.integration.plugins.VeinMiner implements IIntegration {

	private static boolean initDone = false;

	@Override
	public void init() {
		if (initDone || !cyano.basemetals.util.Config.Options.ENABLE_VEINMINER) {
			return;
		}

		addToolsForMaterial("enderium");
		addToolsForMaterial("lumium");
		addToolsForMaterial("prismarinium");
		addToolsForMaterial("signalum");

		initDone = true;
	}
}
