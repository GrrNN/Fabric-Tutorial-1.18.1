package net.linc.rosegoldmod;

import net.fabricmc.api.ModInitializer;
import net.linc.rosegoldmod.block.ModBlocks;
import net.linc.rosegoldmod.item.ModItems;
import net.linc.rosegoldmod.potion.ModPotions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RoseGoldMod implements ModInitializer {
	public static final String MOD_ID = "rosegoldmod";
	public static final Logger LOGGER = LoggerFactory.getLogger("modid");

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModPotions.registerPotions();

	}
}
