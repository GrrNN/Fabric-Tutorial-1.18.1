package net.linc.rosegoldmod.potion;

import net.linc.rosegoldmod.RoseGoldMod;
import net.linc.rosegoldmod.mixin.BrewingRecipeRegistryMixin;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Items;
import net.minecraft.potion.Potion;
import net.minecraft.potion.Potions;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModPotions {
    public static Potion HASTE_POTION;

    public static Potion registerPotion(String name) {
        return Registry.register(Registry.POTION, new Identifier(RoseGoldMod.MOD_ID, name),
                new Potion(new StatusEffectInstance((StatusEffects.HASTE), 3600, 0)));


    }

    public static void registerPotions() {
        HASTE_POTION = registerPotion("haste_potion");

        registerPotionRecipes();

    }

    private static void registerPotionRecipes() {
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, Items.HONEYCOMB,
                ModPotions.HASTE_POTION);
    }

}
