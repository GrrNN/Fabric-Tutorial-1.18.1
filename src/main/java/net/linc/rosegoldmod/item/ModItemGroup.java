package net.linc.rosegoldmod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.linc.rosegoldmod.RoseGoldMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup ROSEGOLD = FabricItemGroupBuilder.build(new Identifier(RoseGoldMod.MOD_ID, "rosegold"),
            () -> new ItemStack(ModItems.ROSEGOLD_INGOT));
}
