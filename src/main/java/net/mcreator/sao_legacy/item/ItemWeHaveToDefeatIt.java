
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
public class ItemWeHaveToDefeatIt extends ElementsTheSAOLegacyMod.ModElement {
	@GameRegistry.ObjectHolder("sao_legacy:wehavetodefeatit")
	public static final Item block = null;
	public ItemWeHaveToDefeatIt(ElementsTheSAOLegacyMod instance) {
		super(instance, 60);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("sao_legacy:wehavetodefeatit", "inventory"));
	}
	public static class MusicDiscItemCustom extends ItemRecord {
		public MusicDiscItemCustom() {
			super("wehavetodefeatit", ElementsTheSAOLegacyMod.sounds.get(new ResourceLocation("sao_legacy:we_have_to_defeat_it")));
			setUnlocalizedName("wehavetodefeatit");
			setRegistryName("wehavetodefeatit");
			setCreativeTab(TabSAORecords.tab);
		}
	}
}
