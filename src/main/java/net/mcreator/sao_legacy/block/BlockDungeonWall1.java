
package net.mcreator.sao_legacy.block;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.Block;

import net.mcreator.sao_legacy.creativetab.TabSAOLegacyMod;
import net.mcreator.sao_legacy.ElementsTheSAOLegacyMod;

@ElementsTheSAOLegacyMod.ModElement.Tag
public class BlockDungeonWall1 extends ElementsTheSAOLegacyMod.ModElement {
	@GameRegistry.ObjectHolder("sao_legacy:dungeonwall1")
	public static final Block block = null;
	public BlockDungeonWall1(ElementsTheSAOLegacyMod instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("dungeonwall1"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("sao_legacy:dungeonwall1", "inventory"));
	}
	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.CIRCUITS);
			setUnlocalizedName("dungeonwall1");
			setSoundType(SoundType.GLASS);
			setHardness(0F);
			setResistance(0F);
			setLightLevel(1F);
			setLightOpacity(0);
			setCreativeTab(TabSAOLegacyMod.tab);
			setBlockUnbreakable();
		}

		@Override
		public boolean isOpaqueCube(IBlockState state) {
			return false;
		}

		@Override
		public boolean canSilkHarvest(World world, BlockPos pos, IBlockState state, EntityPlayer player) {
			return false;
		}
	}
}
