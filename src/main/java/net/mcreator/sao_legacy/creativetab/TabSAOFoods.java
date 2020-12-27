
package net.mcreator.sao_legacy.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.sao_legacy.item.ItemBoarMeatCooked;
import net.mcreator.sao_legacy.ElementsTheSAOLegacyMod;

@ElementsTheSAOLegacyMod.ModElement.Tag
public class TabSAOFoods extends ElementsTheSAOLegacyMod.ModElement {
	public TabSAOFoods(ElementsTheSAOLegacyMod instance) {
		super(instance, 75);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabsaofoods") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemBoarMeatCooked.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
