package net.linc.rosegoldmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.linc.rosegoldmod.RoseGoldMod;
import net.linc.rosegoldmod.item.custom.ModAxeItem;
import net.linc.rosegoldmod.item.custom.ModHoeItem;
import net.linc.rosegoldmod.item.custom.ModPickaxeItem;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.item.EnchantedGoldenAppleItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item ROSEGOLD_INGOT = registerItem("rosegold_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.ROSEGOLD)));

        public static final Item ROSEGOLD_NUGGET = registerItem("rosegold_nugget",
                new Item(new FabricItemSettings().group(ModItemGroup.ROSEGOLD)));

    public static final Item ROSEGOLD_SHARD = registerItem("rosegold_shard",
            new Item(new FabricItemSettings().group(ModItemGroup.ROSEGOLD)));

    public static final Item ROSEGOLD_SWORD = registerItem("rosegold_sword",
            new SwordItem(ModToolMaterials.ROSEGOLD, 4, -2.4f,
                    new FabricItemSettings().group(ModItemGroup.ROSEGOLD)));

    public static final Item ROSEGOLD_AXE = registerItem("rosegold_axe",
            new ModAxeItem(ModToolMaterials.ROSEGOLD, 7f, -3f,
                    new FabricItemSettings().group(ModItemGroup.ROSEGOLD)));

    public static final Item ROSEGOLD_HOE = registerItem("rosegold_hoe",
            new ModHoeItem(ModToolMaterials.ROSEGOLD, -1, -1f,
                    new FabricItemSettings().group(ModItemGroup.ROSEGOLD)));

    public static final Item ROSEGOLD_PICKAXE = registerItem("rosegold_pickaxe",
            new ModPickaxeItem(ModToolMaterials.ROSEGOLD, 2, -2.8f,
                    new FabricItemSettings().group(ModItemGroup.ROSEGOLD)));

    public static final Item ROSEGOLD_SHOVEL = registerItem("rosegold_shovel",
            new ShovelItem(ModToolMaterials.ROSEGOLD, 2.5f, -3f,
                    new FabricItemSettings().group(ModItemGroup.ROSEGOLD)));

    public static final Item ROSEGOLD_HELMET = registerItem("rosegold_helmet",
            new ArmorItem(ModArmourMaterials.ROSEGOLD, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.ROSEGOLD)));

    public static final Item ROSEGOLD_CHESTPLATE = registerItem("rosegold_chestplate",
            new ArmorItem(ModArmourMaterials.ROSEGOLD, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroup.ROSEGOLD)));

    public static final Item ROSEGOLD_LEGGINGS = registerItem("rosegold_leggings",
            new ArmorItem(ModArmourMaterials.ROSEGOLD, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroup.ROSEGOLD)));

    public static final Item ROSEGOLD_BOOTS = registerItem("rosegold_boots",
            new ArmorItem(ModArmourMaterials.ROSEGOLD, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroup.ROSEGOLD)));

    public static final Item ROSEGOLD_APPLE = registerItem("rosegold_apple",
            new Item(new FabricItemSettings().group(ModItemGroup.ROSEGOLD).food(ModFoodComponent.ROSEGOLD_APPLE)));

    public static final Item ENCHANTED_ROSEGOLD_APPLE = registerItem("enchanted_rosegold_apple",
             (Item)new net.linc.rosegoldmod.item.EnchantedGoldenAppleItem(new FabricItemSettings().group(ModItemGroup.ROSEGOLD).rarity(Rarity.EPIC).food(ModFoodComponent.ENCHANTED_ROSEGOLD_APPLE)));



    public static final Item ROSEGOLD_CARROT = registerItem("rosegold_carrot",
            new Item(new FabricItemSettings().group(ModItemGroup.ROSEGOLD).food(ModFoodComponent.ROSEGOLD_CARROT)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(RoseGoldMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        RoseGoldMod.LOGGER.info("Registering Mod Items for " + RoseGoldMod.MOD_ID);
    }



}
