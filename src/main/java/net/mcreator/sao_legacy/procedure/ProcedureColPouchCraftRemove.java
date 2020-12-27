package net.mcreator.sao_legacy.procedure;

import net.minecraft.item.ItemStack;

import net.mcreator.sao_legacy.ElementsTheSAOLegacyMod;

@ElementsTheSAOLegacyMod.ModElement.Tag
public class ProcedureColPouchCraftRemove extends ElementsTheSAOLegacyMod.ModElement {
	public ProcedureColPouchCraftRemove(ElementsTheSAOLegacyMod instance) {
		super(instance, 77);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("itemstack") == null) {
			System.err.println("Failed to load dependency itemstack for procedure ColPouchCraftRemove!");
			return;
		}
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		itemstack.setItemDamage((int) 1024);
		itemstack.setStackDisplayName("Ripped Pouch");
	}
}
