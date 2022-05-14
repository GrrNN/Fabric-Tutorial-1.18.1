package net.linc.rosegoldmod.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class EnchantedGoldenAppleItem
        extends Item {
    public EnchantedGoldenAppleItem(Settings settings) {
        super(settings);
    }



    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }
}


