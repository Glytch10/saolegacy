package net.mcreator.sao_legacy.procedure;

import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.ScoreCriteria;
import net.minecraft.scoreboard.Score;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.sao_legacy.ElementsTheSAOLegacyMod;

@ElementsTheSAOLegacyMod.ModElement.Tag
public class ProcedureTimerDashStop extends ElementsTheSAOLegacyMod.ModElement {
	public ProcedureTimerDashStop(ElementsTheSAOLegacyMod instance) {
		super(instance, 94);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure TimerDashStop!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityPlayer) {
			Scoreboard _sc = ((EntityPlayer) entity).getWorldScoreboard();
			ScoreObjective _so = _sc.getObjective("DashCooldown");
			if (_so == null) {
				_so = _sc.addScoreObjective("DashCooldown", ScoreCriteria.DUMMY);
			}
			Score _scr = _sc.getOrCreateScore(((EntityPlayer) entity).getGameProfile().getName(), _so);
			_scr.setScorePoints((int) 0);
		}
	}
}
