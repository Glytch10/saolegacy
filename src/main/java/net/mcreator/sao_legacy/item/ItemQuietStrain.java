
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
public class ItemQuietStrain extends ElementsTheSAOLegacyMod.ModElement {
	@GameRegistry.ObjectHolder("sao_legacy:quietstrain")
	public static final Item block = null;
	public ItemQuietStrain(ElementsTheSAOLegacyMod instance) {
		super(instance, 53);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("sao_legacy:quietstrain", "inventory"));
	}
	public static class MusicDiscItemCustom extends ItemRecord {
		public MusicDiscItemCustom() {
			super("quietstrain", ElementsTheSAOLegacyMod.sounds.get(new ResourceLocation("sao_legacy:quiet_strain")));
			setUnlocalizedName("quietstrain");
			setRegistryName("quietstrain");
			setCreativeTab(TabSAORecords.tab);
		}
	}
}
