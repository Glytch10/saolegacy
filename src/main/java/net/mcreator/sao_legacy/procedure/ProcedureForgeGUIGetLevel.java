package net.mcreator.sao_legacy.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Score;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;
import net.minecraft.block.state.IBlockState;

import net.mcreator.sao_legacy.ElementsTheSAOLegacyMod;

@ElementsTheSAOLegacyMod.ModElement.Tag
public class ProcedureForgeGUIGetLevel extends ElementsTheSAOLegacyMod.ModElement {
	public ProcedureForgeGUIGetLevel(ElementsTheSAOLegacyMod instance) {
		super(instance, 88);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure ForgeGUIGetLevel!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure ForgeGUIGetLevel!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure ForgeGUIGetLevel!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure ForgeGUIGetLevel!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure ForgeGUIGetLevel!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (!world.isRemote) {
			BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
			TileEntity _tileEntity = world.getTileEntity(_bp);
			IBlockState _bs = world.getBlockState(_bp);
			if (_tileEntity != null)
				_tileEntity.getTileData().setDouble("blacksmithLevel", (new Object() {
					public int getScore(String score) {
						if (entity instanceof EntityPlayer) {
							Scoreboard _sc = ((EntityPlayer) entity).getWorldScoreboard();
							ScoreObjective _so = _sc.getObjective(score);
							if (_so != null) {
								Score _scr = _sc.getOrCreateScore(((EntityPlayer) entity).getGameProfile().getName(), _so);
								return _scr.getScorePoints();
							}
						}
						return 0;
					}
				}.getScore("blacksmithing")));
			world.notifyBlockUpdate(_bp, _bs, _bs, 3);
		}
	}
}
