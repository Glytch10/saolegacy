
package net.mcreator.sao_legacy.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemRecord;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.sao_legacy.creativetab.TabSAORecords;
import net.mcreator.sao_legacy.ElementsTheSAOLegacyMod;

@ElementsTheSAOLegacyMod.ModElement.Tag
public class ItemConfrontBattle extends ElementsTheSAOLegacyMod.ModElement {
	@GameRegistry.ObjectHolder("sao_legacy:confrontbattle")
	public static final Item block = null;
	public ItemConfrontBattle(ElementsTheSAOLegacyMod instance) {
		super(instance, 58);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("sao_legacy:confrontbattle", "inventory"));
	}
	public static class MusicDiscItemCustom extends ItemRecord {
		public MusicDiscItemCustom() {
			super("confrontbattle", ElementsTheSAOLegacyMod.sounds.get(new ResourceLocation("sao_legacy:confront_battle")));
			setUnlocalizedName("confrontbattle");
			setRegistryName("confrontbattle");
			setCreativeTab(TabSAORecords.tab);
		}
	}
}
