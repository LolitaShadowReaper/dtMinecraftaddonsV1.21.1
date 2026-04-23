package net.dtaddons.dtaddonsmod.item;

import net.minecraft.world.food.FoodProperties;


public class ModFoodProperties {
    public static final FoodProperties CHEESYPIZZA = new FoodProperties.Builder().nutrition(8).saturationModifier(0.25f)
            .build();

    public static final FoodProperties PEPPERONIPIZZA = new FoodProperties.Builder().nutrition(12).saturationModifier(0.25f)
            .build();
}
