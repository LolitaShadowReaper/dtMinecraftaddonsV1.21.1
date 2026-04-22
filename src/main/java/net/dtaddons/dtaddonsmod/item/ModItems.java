package net.dtaddons.dtaddonsmod.item;

import net.dtaddons.dtaddonsmod.DTsAddonsMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(DTsAddonsMod.MOD_ID);

    public static final DeferredItem<Item> CORPSEBAG = ITEMS.register("corpsebag",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> REMNANT = ITEMS.register("remnant",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> HAUNTEDMETAL = ITEMS.register("hauntedmetal",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventbus) {
        ITEMS.register(eventbus);

    }

}
