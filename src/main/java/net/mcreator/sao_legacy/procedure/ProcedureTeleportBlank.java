package net.mcreator.sao_legacy.procedure;

import net.minecraft.world.World;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.sao_legacy.ElementsTheSAOLegacyMod;

@ElementsTheSAOLegacyMod.ModElement.Tag
public class ProcedureTeleportBlank extends ElementsTheSAOLegacyMod.ModElement {
	public ProcedureTeleportBlank(ElementsTheSAOLegacyMod instance) {
		super(instance, 65);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure TeleportBlank!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure TeleportBlank!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		World world = (World) dependencies.get("world");
		if (entity instanceof EntityPlayer && !world.isRemote) {
			((EntityPlayer) entity).sendStatusMessage(new TextComponentString("No bound location for this crystal!"), (true));
		}
	}
}
