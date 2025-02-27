
/*
 *    SystemFileB note: 这个文件现在不会被重新生成awa
 */
package net.systemfileb.mods.strange.init;

import net.systemfileb.mods.strange.BucketStrangeMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.ItemEnchantments;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.core.component.DataComponentType;
import net.minecraft.core.component.DataComponents;

import net.minecraft.world.entity.EquipmentSlot;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;

public class BucketStrangeModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BucketStrangeMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> BUCKET_STRANGE = REGISTRY.register("bucket_strange",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.bucket_strange.bucket_strange")).icon(() -> new ItemStack(Items.WATER_BUCKET)).displayItems((parameters, tabData) -> {
				tabData.accept(BucketStrangeModItems.SPEEDRUN_DISC.get());
				tabData.accept(BucketStrangeModItems.SPEEDRUN_DISC_BACKGROUND.get());
			}).build());
	
	private static ItemStack getEnchantedBook(String namespace, int level) {
		ItemStack enchbook = new ItemStack(Items.ENCHANTED_BOOK);

		// 1. 直接构造附魔的ResourceLocation（不检查是否存在）
		ResourceLocation enchantmentId = ResourceLocation.parse(namespace);

		// 2. 创建单个附魔-等级的键值对
		Map<Enchantment, Integer> enchantmentsMap = new HashMap<>();
		enchantmentsMap.put(
			Enchantment.create(
				enchantmentId,
				Enchantment.definition(  // 移除多余的Properties包装
					Enchantment.dynamicCost(1, 10),
					Enchantment.dynamicCost(1, 10),
					1,
					EquipmentSlot.Type.ALL // 使用正确的枚举常量
				),
			level
		));

		// 3. 转换为ItemEnchantments组件
		ItemEnchantments enchantments = new ItemEnchantments(
			new Object2IntOpenHashMap<Enchantment>(enchantmentsMap), // 显式指定泛型类型
			true
		);

		// 4. 直接设置组件
		enchbook.set(DataComponents.STORED_ENCHANTMENTS, enchantments);
		return enchbook;
		}
}
