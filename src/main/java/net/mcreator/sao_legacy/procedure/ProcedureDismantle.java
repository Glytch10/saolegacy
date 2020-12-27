package net.mcreator.sao_legacy.procedure;

import net.minecraft.entity.Entity;

import net.mcreator.sao_legacy.ElementsTheSAOLegacyMod;

@ElementsTheSAOLegacyMod.ModElement.Tag
public class ProcedureDismantle extends ElementsTheSAOLegacyMod.ModElement {
	public ProcedureDismantle(ElementsTheSAOLegacyMod instance) {
		super(instance, 82);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Dismantle!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		{
			java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
			$_dependencies.put("entity", entity);
			ProcedureDismantleF1Weapons.executeProcedure($_dependencies);
		}
	}
}
