package net.mcreator.sao_legacy.procedure;

import net.minecraft.world.WorldServer;
import net.minecraft.world.World;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.sao_legacy.item.ItemTeleportCrystalToB;
import net.mcreator.sao_legacy.ElementsTheSAOLegacyMod;

@ElementsTheSAOLegacyMod.ModElement.Tag
public class ProcedureTeleportToB extends ElementsTheSAOLegacyMod.ModElement {
	public ProcedureTeleportToB(ElementsTheSAOLegacyMod instance) {
		super(instance, 66);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure TeleportToB!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure TeleportToB!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		World world = (World) dependencies.get("world");
		if (entity instanceof EntityPlayer && !world.isRemote) {
			((EntityPlayer) entity).sendStatusMessage(new TextComponentString("Teleporting..."), (true));
		}
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemTeleportCrystalToB.block, (int) (1)).getItem(), -1, (int) 1, null);
		entity.fallDistance = (float) (0);
		entity.setPositionAndUpdate(-332, 72, 1015);
		world.playSound((EntityPlayer) null, (entity.posX), (entity.posY), (entity.posZ),
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.endermen.teleport")),
				SoundCategory.NEUTRAL, (float) 0.1, (float) 1);
		world.playSound((EntityPlayer) null, (entity.posX), (entity.posY), (entity.posZ),
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("block.glass.break")),
				SoundCategory.NEUTRAL, (float) 0.5, (float) 1.8);
		if (world instanceof WorldServer)
			((WorldServer) world).spawnParticle(EnumParticleTypes.PORTAL, (entity.posX), ((entity.posY) + 1), (entity.posZ), (int) 20, 0.2, 0.7, 0.2,
					0, new int[0]);
	}
}
