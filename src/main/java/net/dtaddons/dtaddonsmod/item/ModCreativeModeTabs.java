package net.dtaddons.dtaddonsmod.item;

import net.dtaddons.dtaddonsmod.DTsAddonsMod;
import net.dtaddons.dtaddonsmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DTsAddonsMod.MOD_ID);

    public static final Supplier<CreativeModeTab> FNAF_ITEMS_TAB = CREATIVE_MODE_TAB.register("fnaf_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.REMNANT.get()))
                    .title(Component.translatable("creativetab.dtsaddonsmod.fnaf_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.REMNANT);
                        output.accept(ModItems.CORPSEBAG);
                        output.accept(ModItems.HAUNTEDMETAL);
                        output.accept(ModItems.DOUGH);
                        output.accept(ModItems.CHEESYPIZZA);
                        output.accept(ModItems.PEPPERONIPIZZA);

                    }).build());

    public static final Supplier<CreativeModeTab> FNAF_BLOCKS_TAB = CREATIVE_MODE_TAB.register("fnaf_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.OLDCRATE))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(DTsAddonsMod.MOD_ID, "fnaf_items_tab"))
                    .title(Component.translatable("creativetab.dtsaddonsmod.fnaf_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.OLDCRATE);


                    }).build());

    public static final Supplier<CreativeModeTab> TF2_ITEMS_TAB = CREATIVE_MODE_TAB.register("tf2_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.AUSTRALIUM_ORE))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(DTsAddonsMod.MOD_ID, "fnaf_blocks_tab"))
                    .title(Component.translatable("creativetab.dtsaddonsmod.tf2_items"))
                    .displayItems((itemDisplayParameters, output) -> {



                    }).build());

    public static final Supplier<CreativeModeTab> TF2_BLOCKS_TAB = CREATIVE_MODE_TAB.register("tf2_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.AUSTRALIUM_ORE))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(DTsAddonsMod.MOD_ID, "tf2_items_tab"))
                    .title(Component.translatable("creativetab.dtsaddonsmod.tf2_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.AUSTRALIUM_ORE);


                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }

}
