package net.mcreator.sao_legacy.procedure;

import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.ScoreCriteria;
import net.minecraft.scoreboard.Score;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.sao_legacy.ElementsTheSAOLegacyMod;

@ElementsTheSAOLegacyMod.ModElement.Tag
public class ProcedureUpdateYaw extends ElementsTheSAOLegacyMod.ModElement {
	public ProcedureUpdateYaw(ElementsTheSAOLegacyMod instance) {
		super(instance, 81);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure UpdateYaw!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((((entity.rotationYaw) > -11.25) && ((entity.rotationYaw) < 11.25))) {
			if (entity instanceof EntityPlayer) {
				Scoreboard _sc = ((EntityPlayer) entity).getWorldScoreboard();
				ScoreObjective _so = _sc.getObjective("yaw");
				if (_so == null) {
					_so = _sc.addScoreObjective("yaw", ScoreCriteria.DUMMY);
				}
				Score _scr = _sc.getOrCreateScore(((EntityPlayer) entity).getGameProfile().getName(), _so);
				_scr.setScorePoints((int) 1);
			}
		}
		if ((((entity.rotationYaw) >= 11.25) && ((entity.rotationYaw) < 33.75))) {
			if (entity instanceof EntityPlayer) {
				Scoreboard _sc = ((EntityPlayer) entity).getWorldScoreboard();
				ScoreObjective _so = _sc.getObjective("yaw");
				if (_so == null) {
					_so = _sc.addScoreObjective("yaw", ScoreCriteria.DUMMY);
				}
				Score _scr = _sc.getOrCreateScore(((EntityPlayer) entity).getGameProfile().getName(), _so);
				_scr.setScorePoints((int) 2);
			}
		}
		if ((((entity.rotationYaw) >= 33.75) && ((entity.rotationYaw) < 56.25))) {
			if (entity instanceof EntityPlayer) {
				Scoreboard _sc = ((EntityPlayer) entity).getWorldScoreboard();
				ScoreObjective _so = _sc.getObjective("yaw");
				if (_so == null) {
					_so = _sc.addScoreObjective("yaw", ScoreCriteria.DUMMY);
				}
				Score _scr = _sc.getOrCreateScore(((EntityPlayer) entity).getGameProfile().getName(), _so);
				_scr.setScorePoints((int) 3);
			}
		}
		if ((((entity.rotationYaw) >= 56.25) && ((entity.rotationYaw) < 78.75))) {
			if (entity instanceof EntityPlayer) {
				Scoreboard _sc = ((EntityPlayer) entity).getWorldScoreboard();
				ScoreObjective _so = _sc.getObjective("yaw");
				if (_so == null) {
					_so = _sc.addScoreObjective("yaw", ScoreCriteria.DUMMY);
				}
				Score _scr = _sc.getOrCreateScore(((EntityPlayer) entity).getGameProfile().getName(), _so);
				_scr.setScorePoints((int) 4);
			}
		}
		if ((((entity.rotationYaw) >= 78.75) && ((entity.rotationYaw) < 101.25))) {
			if (entity instanceof EntityPlayer) {
				Scoreboard _sc = ((EntityPlayer) entity).getWorldScoreboard();
				ScoreObjective _so = _sc.getObjective("yaw");
				if (_so == null) {
					_so = _sc.addScoreObjective("yaw", ScoreCriteria.DUMMY);
				}
				Score _scr = _sc.getOrCreateScore(((EntityPlayer) entity).getGameProfile().getName(), _so);
				_scr.setScorePoints((int) 5);
			}
		}
		if ((((entity.rotationYaw) >= 101.25) && ((entity.rotationYaw) < 123.75))) {
			if (entity instanceof EntityPlayer) {
				Scoreboard _sc = ((EntityPlayer) entity).getWorldScoreboard();
				ScoreObjective _so = _sc.getObjective("yaw");
				if (_so == null) {
					_so = _sc.addScoreObjective("yaw", ScoreCriteria.DUMMY);
				}
				Score _scr = _sc.getOrCreateScore(((EntityPlayer) entity).getGameProfile().getName(), _so);
				_scr.setScorePoints((int) 6);
			}
		}
		if ((((entity.rotationYaw) >= 123.75) && ((entity.rotationYaw) < 146.25))) {
			if (entity instanceof EntityPlayer) {
				Scoreboard _sc = ((EntityPlayer) entity).getWorldScoreboard();
				ScoreObjective _so = _sc.getObjective("yaw");
				if (_so == null) {
					_so = _sc.addScoreObjective("yaw", ScoreCriteria.DUMMY);
				}
				Score _scr = _sc.getOrCreateScore(((EntityPlayer) entity).getGameProfile().getName(), _so);
				_scr.setScorePoints((int) 7);
			}
		}
		if ((((entity.rotationYaw) >= 146.25) && ((entity.rotationYaw) < 168.75))) {
			if (entity instanceof EntityPlayer) {
				Scoreboard _sc = ((EntityPlayer) entity).getWorldScoreboard();
				ScoreObjective _so = _sc.getObjective("yaw");
				if (_so == null) {
					_so = _sc.addScoreObjective("yaw", ScoreCriteria.DUMMY);
				}
				Score _scr = _sc.getOrCreateScore(((EntityPlayer) entity).getGameProfile().getName(), _so);
				_scr.setScorePoints((int) 8);
			}
		}
		if ((((entity.rotationYaw) >= 168.75) && ((entity.rotationYaw) < 191.25))) {
			if (entity instanceof EntityPlayer) {
				Scoreboard _sc = ((EntityPlayer) entity).getWorldScoreboard();
				ScoreObjective _so = _sc.getObjective("yaw");
				if (_so == null) {
					_so = _sc.addScoreObjective("yaw", ScoreCriteria.DUMMY);
				}
				Score _scr = _sc.getOrCreateScore(((EntityPlayer) entity).getGameProfile().getName(), _so);
				_scr.setScorePoints((int) 9);
			}
		}
		if ((((entity.rotationYaw) >= 191.25) && ((entity.rotationYaw) < 213.75))) {
			if (entity instanceof EntityPlayer) {
				Scoreboard _sc = ((EntityPlayer) entity).getWorldScoreboard();
				ScoreObjective _so = _sc.getObjective("yaw");
				if (_so == null) {
					_so = _sc.addScoreObjective("yaw", ScoreCriteria.DUMMY);
				}
				Score _scr = _sc.getOrCreateScore(((EntityPlayer) entity).getGameProfile().getName(), _so);
				_scr.setScorePoints((int) 10);
			}
		}
		if ((((entity.rotationYaw) >= 213.75) && ((entity.rotationYaw) < 236.25))) {
			if (entity instanceof EntityPlayer) {
				Scoreboard _sc = ((EntityPlayer) entity).getWorldScoreboard();
				ScoreObjective _so = _sc.getObjective("yaw");
				if (_so == null) {
					_so = _sc.addScoreObjective("yaw", ScoreCriteria.DUMMY);
				}
				Score _scr = _sc.getOrCreateScore(((EntityPlayer) entity).getGameProfile().getName(), _so);
				_scr.setScorePoints((int) 11);
			}
		}
		if ((((entity.rotationYaw) >= 236.25) && ((entity.rotationYaw) < 258.75))) {
			if (entity instanceof EntityPlayer) {
				Scoreboard _sc = ((EntityPlayer) entity).getWorldScoreboard();
				ScoreObjective _so = _sc.getObjective("yaw");
				if (_so == null) {
					_so = _sc.addScoreObjective("yaw", ScoreCriteria.DUMMY);
				}
				Score _scr = _sc.getOrCreateScore(((EntityPlayer) entity).getGameProfile().getName(), _so);
				_scr.setScorePoints((int) 12);
			}
		}
		if ((((entity.rotationYaw) >= 258.75) && ((entity.rotationYaw) < 281.25))) {
			if (entity instanceof EntityPlayer) {
				Scoreboard _sc = ((EntityPlayer) entity).getWorldScoreboard();
				ScoreObjective _so = _sc.getObjective("yaw");
				if (_so == null) {
					_so = _sc.addScoreObjective("yaw", ScoreCriteria.DUMMY);
				}
				Score _scr = _sc.getOrCreateScore(((EntityPlayer) entity).getGameProfile().getName(), _so);
				_scr.setScorePoints((int) 13);
			}
		}
		if ((((entity.rotationYaw) >= 281.25) && ((entity.rotationYaw) < 303.75))) {
			if (entity instanceof EntityPlayer) {
				Scoreboard _sc = ((EntityPlayer) entity).getWorldScoreboard();
				ScoreObjective _so = _sc.getObjective("yaw");
				if (_so == null) {
					_so = _sc.addScoreObjective("yaw", ScoreCriteria.DUMMY);
				}
				Score _scr = _sc.getOrCreateScore(((EntityPlayer) entity).getGameProfile().getName(), _so);
				_scr.setScorePoints((int) 14);
			}
		}
		if ((((entity.rotationYaw) >= 303.75) && ((entity.rotationYaw) < 326.25))) {
			if (entity instanceof EntityPlayer) {
				Scoreboard _sc = ((EntityPlayer) entity).getWorldScoreboard();
				ScoreObjective _so = _sc.getObjective("yaw");
				if (_so == null) {
					_so = _sc.addScoreObjective("yaw", ScoreCriteria.DUMMY);
				}
				Score _scr = _sc.getOrCreateScore(((EntityPlayer) entity).getGameProfile().getName(), _so);
				_scr.setScorePoints((int) 15);
			}
		}
		if ((((entity.rotationYaw) >= 326.25) && ((entity.rotationYaw) < 348.75))) {
			if (entity instanceof EntityPlayer) {
				Scoreboard _sc = ((EntityPlayer) entity).getWorldScoreboard();
				ScoreObjective _so = _sc.getObjective("yaw");
				if (_so == null) {
					_so = _sc.addScoreObjective("yaw", ScoreCriteria.DUMMY);
				}
				Score _scr = _sc.getOrCreateScore(((EntityPlayer) entity).getGameProfile().getName(), _so);
				_scr.setScorePoints((int) 16);
			}
		}
		if ((((entity.rotationYaw) >= 348.75) && ((entity.rotationYaw) < 360))) {
			if (entity instanceof EntityPlayer) {
				Scoreboard _sc = ((EntityPlayer) entity).getWorldScoreboard();
				ScoreObjective _so = _sc.getObjective("yaw");
				if (_so == null) {
					_so = _sc.addScoreObjective("yaw", ScoreCriteria.DUMMY);
				}
				Score _scr = _sc.getOrCreateScore(((EntityPlayer) entity).getGameProfile().getName(), _so);
				_scr.setScorePoints((int) 1);
			}
		}
		if ((((entity.rotationYaw) <= -11.25) && ((entity.rotationYaw) > -33.75))) {
			if (entity instanceof EntityPlayer) {
				Scoreboard _sc = ((EntityPlayer) entity).getWorldScoreboard();
				ScoreObjective _so = _sc.getObjective("yaw");
				if (_so == null) {
					_so = _sc.addScoreObjective("yaw", ScoreCriteria.DUMMY);
				}
				Score _scr = _sc.getOrCreateScore(((EntityPlayer) entity).getGameProfile().getName(), _so);
				_scr.setScorePoints((int) 16);
			}
		}
		if ((((entity.rotationYaw) <= -33.75) && ((entity.rotationYaw) > -56.25))) {
			if (entity instanceof EntityPlayer) {
				Scoreboard _sc = ((EntityPlayer) entity).getWorldScoreboard();
				ScoreObjective _so = _sc.getObjective("yaw");
				if (_so == null) {
					_so = _sc.addScoreObjective("yaw", ScoreCriteria.DUMMY);
				}
				Score _scr = _sc.getOrCreateScore(((EntityPlayer) entity).getGameProfile().getName(), _so);
				_scr.setScorePoints((int) 15);
			}
		}
		if ((((entity.rotationYaw) <= -56.25) && ((entity.rotationYaw) > -78.75))) {
			if (entity instanceof EntityPlayer) {
				Scoreboard _sc = ((EntityPlayer) entity).getWorldScoreboard();
				ScoreObjective _so = _sc.getObjective("yaw");
				if (_so == null) {
					_so = _sc.addScoreObjective("yaw", ScoreCriteria.DUMMY);
				}
				Score _scr = _sc.getOrCreateScore(((EntityPlayer) entity).getGameProfile().getName(), _so);
				_scr.setScorePoints((int) 14);
			}
		}
		if ((((entity.rotationYaw) <= -78.75) && ((entity.rotationYaw) > -101.25))) {
			if (entity instanceof EntityPlayer) {
				Scoreboard _sc = ((EntityPlayer) entity).getWorldScoreboard();
				ScoreObjective _so = _sc.getObjective("yaw");
				if (_so == null) {
					_so = _sc.addScoreObjective("yaw", ScoreCriteria.DUMMY);
				}
				Score _scr = _sc.getOrCreateScore(((EntityPlayer) entity).getGameProfile().getName(), _so);
				_scr.setScorePoints((int) 13);
			}
		}
		if ((((entity.rotationYaw) <= -101.25) && ((entity.rotationYaw) > -123.75))) {
			if (entity instanceof EntityPlayer) {
				Scoreboard _sc = ((EntityPlayer) entity).getWorldScoreboard();
				ScoreObjective _so = _sc.getObjective("yaw");
				if (_so == null) {
					_so = _sc.addScoreObjective("yaw", ScoreCriteria.DUMMY);
				}
				Score _scr = _sc.getOrCreateScore(((EntityPlayer) entity).getGameProfile().getName(), _so);
				_scr.setScorePoints((int) 12);
			}
		}
		if ((((entity.rotationYaw) <= -123.75) && ((entity.rotationYaw) > -146.25))) {
			if (entity instanceof EntityPlayer) {
				Scoreboard _sc = ((EntityPlayer) entity).getWorldScoreboard();
				ScoreObjective _so = _sc.getObjective("yaw");
				if (_so == null) {
					_so = _sc.addScoreObjective("yaw", ScoreCriteria.DUMMY);
				}
				Score _scr = _sc.getOrCreateScore(((EntityPlayer) entity).getGameProfile().getName(), _so);
				_scr.setScorePoints((int) 11);
			}
		}
		if ((((entity.rotationYaw) <= -146.25) && ((entity.rotationYaw) > -168.75))) {
			if (entity instanceof EntityPlayer) {
				Scoreboard _sc = ((EntityPlayer) entity).getWorldScoreboard();
				ScoreObjective _so = _sc.getObjective("yaw");
				if (_so == null) {
					_so = _sc.addScoreObjective("yaw", ScoreCriteria.DUMMY);
				}
				Score _scr = _sc.getOrCreateScore(((EntityPlayer) entity).getGameProfile().getName(), _so);
				_scr.setScorePoints((int) 10);
			}
		}
		if ((((entity.rotationYaw) <= -168.75) && ((entity.rotationYaw) > -191.25))) {
			if (entity instanceof EntityPlayer) {
				Scoreboard _sc = ((EntityPlayer) entity).getWorldScoreboard();
				ScoreObjective _so = _sc.getObjective("yaw");
				if (_so == null) {
					_so = _sc.addScoreObjective("yaw", ScoreCriteria.DUMMY);
				}
				Score _scr = _sc.getOrCreateScore(((EntityPlayer) entity).getGameProfile().getName(), _so);
				_scr.setScorePoints((int) 9);
			}
		}
		if ((((entity.rotationYaw) <= -191.25) && ((entity.rotationYaw) > -213.75))) {
			if (entity instanceof EntityPlayer) {
				Scoreboard _sc = ((EntityPlayer) entity).getWorldScoreboard();
				ScoreObjective _so = _sc.getObjective("yaw");
				if (_so == null) {
					_so = _sc.addScoreObjective("yaw", ScoreCriteria.DUMMY);
				}
				Score _scr = _sc.getOrCreateScore(((EntityPlayer) entity).getGameProfile().getName(), _so);
				_scr.setScorePoints((int) 8);
			}
		}
		if ((((entity.rotationYaw) <= -213.75) && ((entity.rotationYaw) > -236.25))) {
			if (entity instanceof EntityPlayer) {
				Scoreboard _sc = ((EntityPlayer) entity).getWorldScoreboard();
				ScoreObjective _so = _sc.getObjective("yaw");
				if (_so == null) {
					_so = _sc.addScoreObjective("yaw", ScoreCriteria.DUMMY);
				}
				Score _scr = _sc.getOrCreateScore(((EntityPlayer) entity).getGameProfile().getName(), _so);
				_scr.setScorePoints((int) 7);
			}
		}
		if ((((entity.rotationYaw) <= -236.25) && ((entity.rotationYaw) > -258.75))) {
			if (entity instanceof EntityPlayer) {
				Scoreboard _sc = ((EntityPlayer) entity).getWorldScoreboard();
				ScoreObjective _so = _sc.getObjective("yaw");
				if (_so == null) {
					_so = _sc.addScoreObjective("yaw", ScoreCriteria.DUMMY);
				}
				Score _scr = _sc.getOrCreateScore(((EntityPlayer) entity).getGameProfile().getName(), _so);
				_scr.setScorePoints((int) 6);
			}
		}
		if ((((entity.rotationYaw) <= -258.75) && ((entity.rotationYaw) > -281.25))) {
			if (entity instanceof EntityPlayer) {
				Scoreboard _sc = ((EntityPlayer) entity).getWorldScoreboard();
				ScoreObjective _so = _sc.getObjective("yaw");
				if (_so == null) {
					_so = _sc.addScoreObjective("yaw", ScoreCriteria.DUMMY);
				}
				Score _scr = _sc.getOrCreateScore(((EntityPlayer) entity).getGameProfile().getName(), _so);
				_scr.setScorePoints((int) 5);
			}
		}
		if ((((entity.rotationYaw) <= -281.25) && ((entity.rotationYaw) > -303.75))) {
			if (entity instanceof EntityPlayer) {
				Scoreboard _sc = ((EntityPlayer) entity).getWorldScoreboard();
				ScoreObjective _so = _sc.getObjective("yaw");
				if (_so == null) {
					_so = _sc.addScoreObjective("yaw", ScoreCriteria.DUMMY);
				}
				Score _scr = _sc.getOrCreateScore(((EntityPlayer) entity).getGameProfile().getName(), _so);
				_scr.setScorePoints((int) 4);
			}
		}
		if ((((entity.rotationYaw) <= -303.75) && ((entity.rotationYaw) > -326.25))) {
			if (entity instanceof EntityPlayer) {
				Scoreboard _sc = ((EntityPlayer) entity).getWorldScoreboard();
				ScoreObjective _so = _sc.getObjective("yaw");
				if (_so == null) {
					_so = _sc.addScoreObjective("yaw", ScoreCriteria.DUMMY);
				}
				Score _scr = _sc.getOrCreateScore(((EntityPlayer) entity).getGameProfile().getName(), _so);
				_scr.setScorePoints((int) 3);
			}
		}
		if ((((entity.rotationYaw) <= -326.25) && ((entity.rotationYaw) > -348.75))) {
			if (entity instanceof EntityPlayer) {
				Scoreboard _sc = ((EntityPlayer) entity).getWorldScoreboard();
				ScoreObjective _so = _sc.getObjective("yaw");
				if (_so == null) {
					_so = _sc.addScoreObjective("yaw", ScoreCriteria.DUMMY);
				}
				Score _scr = _sc.getOrCreateScore(((EntityPlayer) entity).getGameProfile().getName(), _so);
				_scr.setScorePoints((int) 2);
			}
		}
		if ((((entity.rotationYaw) <= -348.75) && ((entity.rotationYaw) > -360))) {
			if (entity instanceof EntityPlayer) {
				Scoreboard _sc = ((EntityPlayer) entity).getWorldScoreboard();
				ScoreObjective _so = _sc.getObjective("yaw");
				if (_so == null) {
					_so = _sc.addScoreObjective("yaw", ScoreCriteria.DUMMY);
				}
				Score _scr = _sc.getOrCreateScore(((EntityPlayer) entity).getGameProfile().getName(), _so);
				_scr.setScorePoints((int) 1);
			}
		}
	}

	@SubscribeEvent
	public void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			Entity entity = event.player;
			World world = entity.world;
			int i = (int) entity.posX;
			int j = (int) entity.posY;
			int k = (int) entity.posZ;
			java.util.HashMap<String, Object> dependencies = new java.util.HashMap<>();
			dependencies.put("x", i);
			dependencies.put("y", j);
			dependencies.put("z", k);
			dependencies.put("world", world);
			dependencies.put("entity", entity);
			dependencies.put("event", event);
			this.executeProcedure(dependencies);
		}
	}

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(this);
	}
}
