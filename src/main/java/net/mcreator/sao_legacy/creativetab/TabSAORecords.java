
package net.mcreator.sao_legacy.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.sao_legacy.item.ItemSwordland;
import net.mcreator.sao_legacy.ElementsTheSAOLegacyMod;

@ElementsTheSAOLegacyMod.ModElement.Tag
public class TabSAORecords extends ElementsTheSAOLegacyMod.ModElement {
	public TabSAORecords(ElementsTheSAOLegacyMod instance) {
		super(instance, 73);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabsaorecords") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemSwordland.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static CreativeTabs tab;
}
