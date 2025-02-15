
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.systemfileb.mods.strange.init;

import net.systemfileb.mods.strange.BucketStrangeMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class BucketStrangeModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, BucketStrangeMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> SPEEDRUN_DISC = REGISTRY.register("speedrun_disc", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("bucket_strange", "speedrun_disc")));
	public static final DeferredHolder<SoundEvent, SoundEvent> SPEEDRUN_DISC_STEREO = REGISTRY.register("speedrun_disc_stereo",
			() -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("bucket_strange", "speedrun_disc_stereo")));
}
