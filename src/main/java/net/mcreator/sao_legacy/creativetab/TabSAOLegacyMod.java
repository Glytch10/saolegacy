
package net.mcreator.sao_legacy.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.sao_legacy.item.ItemTeleportCrystalToB;
import net.mcreator.sao_legacy.ElementsTheSAOLegacyMod;

@ElementsTheSAOLegacyMod.ModElement.Tag
public class TabSAOLegacyMod extends ElementsTheSAOLegacyMod.ModElement {
	public TabSAOLegacyMod(ElementsTheSAOLegacyMod instance) {
		super(instance, 64);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabsaolegacymod") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemTeleportCrystalToB.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
