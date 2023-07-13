package net.piggy.tutorialmod.item;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.piggy.tutorialmod.TutorialMod;

@Mod.EventBusSubscriber(modid = TutorialMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {
    public static CreativeModeTab CURRENCY_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event){
        CURRENCY_TAB = event.registerCreativeModeTab(new ResourceLocation(TutorialMod.MOD_ID, "currency_tab"),
              builder -> builder.icon(() -> new ItemStack(ModItems.GOLD_DABLOON.get()))
                      .title(Component.translatable("creativemodetab.currency_tab")));
    }
}
