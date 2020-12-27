
package net.mcreator.sao_legacy.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.sao_legacy.item.ItemBoarMeatCooked;
import net.mcreator.sao_legacy.item.ItemBoarMeat;
import net.mcreator.sao_legacy.ElementsTheSAOLegacyMod;

@ElementsTheSAOLegacyMod.ModElement.Tag
public class RecipeCookBoarMeat extends ElementsTheSAOLegacyMod.ModElement {
	public RecipeCookBoarMeat(ElementsTheSAOLegacyMod instance) {
		super(instance, 74);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemBoarMeat.block, (int) (1)), new ItemStack(ItemBoarMeatCooked.block, (int) (1)), 1F);
	}
}
