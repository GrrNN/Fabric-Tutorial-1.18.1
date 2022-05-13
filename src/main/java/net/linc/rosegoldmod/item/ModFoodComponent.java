package net.linc.rosegoldmod.item;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ModFoodComponent {
    public static final FoodComponent ROSEGOLD_APPLE;
    public static final FoodComponent ROSEGOLD_CARROT;
    public static final FoodComponent ENCHANTED_ROSEGOLD_APPLE;

    public static final FoodComponent SWEETENED_HONEY_BOTTLE;

  static {
      SWEETENED_HONEY_BOTTLE = (new FoodComponent.Builder()).hunger(8).saturationModifier(1F).alwaysEdible().build();
      ROSEGOLD_APPLE = (new FoodComponent.Builder()).hunger(4).saturationModifier(1.2F).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100, 1), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 2400, 0), 1.0F).alwaysEdible().build();
      ROSEGOLD_CARROT = (new FoodComponent.Builder()).hunger(6).saturationModifier(1.2F).build();
      ENCHANTED_ROSEGOLD_APPLE = (new FoodComponent.Builder()).hunger(4).saturationModifier(1.2F).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 400, 1), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 6000, 0), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 6000, 0), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 2400, 1), 1.0F).alwaysEdible().build();
  }


}