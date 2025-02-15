
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.systemfileb.mods.strange.init;

import net.systemfileb.mods.strange.BucketStrangeMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

public class BucketStrangeModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BucketStrangeMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> BUCKETSTRANGE = REGISTRY.register("bucketstrange",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.bucket_strange.bucketstrange")).icon(() -> new ItemStack(Items.WATER_BUCKET)).displayItems((parameters, tabData) -> {
				tabData.accept(BucketStrangeModItems.SPEEDRUN_DISC.get());
				tabData.accept(BucketStrangeModItems.SPEEDRUN_DISC_BACKGROUND.get());
			}).build());
}
