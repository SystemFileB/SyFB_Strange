
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.systemfileb.mods.strange.init;

import net.systemfileb.mods.strange.item.SpeedrunDiscItem;
import net.systemfileb.mods.strange.item.SpeedrunDiscBackgroundItem;
import net.systemfileb.mods.strange.BucketStrangeMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

public class BucketStrangeModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(BucketStrangeMod.MODID);
	public static final DeferredItem<Item> SPEEDRUN_DISC = REGISTRY.register("speedrun_disc", SpeedrunDiscItem::new);
	public static final DeferredItem<Item> SPEEDRUN_DISC_BACKGROUND = REGISTRY.register("speedrun_disc_background", SpeedrunDiscBackgroundItem::new);
	// Start of user code block custom items
	// End of user code block custom items
}
