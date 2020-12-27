package net.mcreator.sao_legacy.procedure;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.World;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.BlockPos;
import net.minecraft.server.MinecraftServer;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;
import net.minecraft.command.ICommandSender;

import net.mcreator.sao_legacy.item.ItemColPouch;
import net.mcreator.sao_legacy.item.ItemCol;
import net.mcreator.sao_legacy.ElementsTheSAOLegacyMod;

@ElementsTheSAOLegacyMod.ModElement.Tag
public class ProcedureConvertPouch extends ElementsTheSAOLegacyMod.ModElement {
	public ProcedureConvertPouch(ElementsTheSAOLegacyMod instance) {
		super(instance, 72);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure ConvertPouch!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			System.err.println("Failed to load dependency itemstack for procedure ConvertPouch!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure ConvertPouch!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		World world = (World) dependencies.get("world");
		if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemOffhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemColPouch.block, (int) (1)).getItem())) {
			if (!world.isRemote && world.getMinecraftServer() != null) {
				world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
					@Override
					public String getName() {
						return "";
					}

					@Override
					public boolean canUseCommand(int permission, String command) {
						return true;
					}

					@Override
					public World getEntityWorld() {
						return world;
					}

					@Override
					public MinecraftServer getServer() {
						return world.getMinecraftServer();
					}

					@Override
					public boolean sendCommandFeedback() {
						return false;
					}

					@Override
					public BlockPos getPosition() {
						return new BlockPos((int) (entity.posX), (int) (entity.posY), (int) (entity.posZ));
					}

					@Override
					public Vec3d getPositionVector() {
						return new Vec3d((entity.posX), (entity.posY), (entity.posZ));
					}
				}, "/title @p actionbar {\"text\":\"Cannot convert in off-hand!\"}");
			}
		} else if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemColPouch.block, (int) (1)).getItem())) {
			if (entity instanceof EntityPlayer) {
				ItemStack _setstack = new ItemStack(ItemCol.block, (int) (1));
				_setstack.setCount((1024 - (itemstack.getItemDamage())));
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
			}
			if (!world.isRemote && world.getMinecraftServer() != null) {
				world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
					@Override
					public String getName() {
						return "";
					}

					@Override
					public boolean canUseCommand(int permission, String command) {
						return true;
					}

					@Override
					public World getEntityWorld() {
						return world;
					}

					@Override
					public MinecraftServer getServer() {
						return world.getMinecraftServer();
					}

					@Override
					public boolean sendCommandFeedback() {
						return false;
					}

					@Override
					public BlockPos getPosition() {
						return new BlockPos((int) (entity.posX), (int) (entity.posY), (int) (entity.posZ));
					}

					@Override
					public Vec3d getPositionVector() {
						return new Vec3d((entity.posX), (entity.posY), (entity.posZ));
					}
				}, "replaceitem entity @p slot.weapon.mainhand minecraft:air");
			}
		}
	}
}
