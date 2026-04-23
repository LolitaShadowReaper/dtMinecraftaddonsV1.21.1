package net.dtaddons.dtaddonsmod.item;

import net.dtaddons.dtaddonsmod.util.ModTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class ModToolTiers {

    public static final Tier AUSTRALIUM = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_AUSTRALIUM_TOOL,
            1400, 4f, 3f, 20, () -> Ingredient.of(ModItems.AUSTRALIUM));

}
