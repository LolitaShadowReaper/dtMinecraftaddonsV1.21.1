package net.dtaddons.dtaddonsmod.item;

import net.dtaddons.dtaddonsmod.DTsAddonsMod;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.List;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(DTsAddonsMod.MOD_ID);

    public static final DeferredItem<Item> CORPSEBAG = ITEMS.register("corpsebag",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> REMNANT = ITEMS.register("remnant",
            () -> new Item(new Item.Properties()){

                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.dtsaddonsmod.remnant.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });

    public static final DeferredItem<Item> HAUNTEDMETAL = ITEMS.register("hauntedmetal",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> CHEESYPIZZA = ITEMS.register("cheesypizza",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CHEESYPIZZA)));

    public static final DeferredItem<Item> PEPPERONIPIZZA = ITEMS.register("pepperonipizza",
            () -> new Item(new Item.Properties().food(ModFoodProperties.PEPPERONIPIZZA)));

    public static final DeferredItem<Item> DOUGH = ITEMS.register("dough",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> AUSTRALIUM = ITEMS.register("australium",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventbus) {
        ITEMS.register(eventbus);

    }

}
