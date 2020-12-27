
package net.mcreator.sao_legacy.block;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.Block;

import net.mcreator.sao_legacy.creativetab.TabSAOLegacyMod;
import net.mcreator.sao_legacy.ElementsTheSAOLegacyMod;

@ElementsTheSAOLegacyMod.ModElement.Tag
public class BlockPortal1 extends ElementsTheSAOLegacyMod.ModElement {
	@GameRegistry.ObjectHolder("sao_legacy:portal1")
	public static final Block block = null;
	public BlockPortal1(ElementsTheSAOLegacyMod instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("portal1"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation("sao_legacy:portal1", "inventory"));
	}
	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.GLASS);
			setUnlocalizedName("portal1");
			setSoundType(SoundType.GLASS);
			setHardness(-0.1F);
			setResistance(0F);
			setLightLevel(0.1F);
			setLightOpacity(0);
			setCreativeTab(TabSAOLegacyMod.tab);
			setBlockUnbreakable();
		}
	}
}
