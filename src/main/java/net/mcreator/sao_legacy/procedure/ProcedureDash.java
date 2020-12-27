package net.mcreator.sao_legacy.procedure;

import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Score;
import net.minecraft.potion.PotionEffect;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.sao_legacy.potion.PotionTimerDash;
import net.mcreator.sao_legacy.ElementsTheSAOLegacyMod;

@ElementsTheSAOLegacyMod.ModElement.Tag
public class ProcedureDash extends ElementsTheSAOLegacyMod.ModElement {
	public ProcedureDash(ElementsTheSAOLegacyMod instance) {
		super(instance, 78);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Dash!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((new Object() {
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
		}.getScore("DashCooldown")) == 0)) {
			if ((entity.isSprinting())) {
				if (((new Object() {
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
				}.getScore("yaw")) == 1)) {
					entity.motionX = 0;
					entity.motionY = (entity.motionY);
					entity.motionZ = 1;
				}
				if (((new Object() {
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
				}.getScore("yaw")) == 2)) {
					entity.motionX = -0.38;
					entity.motionY = (entity.motionY);
					entity.motionZ = 0.92;
				}
				if (((new Object() {
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
				}.getScore("yaw")) == 3)) {
					entity.motionX = -0.71;
					entity.motionY = (entity.motionY);
					entity.motionZ = 0.71;
				}
				if (((new Object() {
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
				}.getScore("yaw")) == 4)) {
					entity.motionX = -0.92;
					entity.motionY = (entity.motionY);
					entity.motionZ = 0.38;
				}
				if (((new Object() {
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
				}.getScore("yaw")) == 5)) {
					entity.motionX = -1;
					entity.motionY = (entity.motionY);
					entity.motionZ = 0;
				}
				if (((new Object() {
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
				}.getScore("yaw")) == 6)) {
					entity.motionX = -0.92;
					entity.motionY = (entity.motionY);
					entity.motionZ = -0.38;
				}
				if (((new Object() {
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
				}.getScore("yaw")) == 7)) {
					entity.motionX = -0.71;
					entity.motionY = (entity.motionY);
					entity.motionZ = -0.71;
				}
				if (((new Object() {
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
				}.getScore("yaw")) == 8)) {
					entity.motionX = -0.38;
					entity.motionY = (entity.motionY);
					entity.motionZ = -0.92;
				}
				if (((new Object() {
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
				}.getScore("yaw")) == 9)) {
					entity.motionX = 0;
					entity.motionY = (entity.motionY);
					entity.motionZ = -1;
				}
				if (((new Object() {
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
				}.getScore("yaw")) == 10)) {
					entity.motionX = 0.38;
					entity.motionY = (entity.motionY);
					entity.motionZ = -0.92;
				}
				if (((new Object() {
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
				}.getScore("yaw")) == 11)) {
					entity.motionX = 0.71;
					entity.motionY = (entity.motionY);
					entity.motionZ = -0.71;
				}
				if (((new Object() {
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
				}.getScore("yaw")) == 12)) {
					entity.motionX = 0.92;
					entity.motionY = (entity.motionY);
					entity.motionZ = -0.38;
				}
				if (((new Object() {
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
				}.getScore("yaw")) == 13)) {
					entity.motionX = 1;
					entity.motionY = (entity.motionY);
					entity.motionZ = 0;
				}
				if (((new Object() {
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
				}.getScore("yaw")) == 14)) {
					entity.motionX = 0.92;
					entity.motionY = (entity.motionY);
					entity.motionZ = 0.38;
				}
				if (((new Object() {
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
				}.getScore("yaw")) == 15)) {
					entity.motionX = 0.71;
					entity.motionY = (entity.motionY);
					entity.motionZ = 0.71;
				}
				if (((new Object() {
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
				}.getScore("yaw")) == 16)) {
					entity.motionX = 0.38;
					entity.motionY = (entity.motionY);
					entity.motionZ = 0.92;
				}
				if (entity instanceof EntityLivingBase)
					((EntityLivingBase) entity).addPotionEffect(new PotionEffect(PotionTimerDash.potion, (int) 10, (int) 1));
			}
		}
	}
}
