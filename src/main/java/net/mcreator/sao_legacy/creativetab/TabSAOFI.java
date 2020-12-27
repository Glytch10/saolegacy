
package net.mcreator.sao_legacy.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.sao_legacy.item.ItemFloor1Icon;
import net.mcreator.sao_legacy.ElementsTheSAOLegacyMod;

@ElementsTheSAOLegacyMod.ModElement.Tag
public class TabSAOFI extends ElementsTheSAOLegacyMod.ModElement {
	public TabSAOFI(ElementsTheSAOLegacyMod instance) {
		super(instance, 76);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabsaofi") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemFloor1Icon.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
