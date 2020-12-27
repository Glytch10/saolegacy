
package net.mcreator.sao_legacy.potion;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.Potion;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.ai.attributes.AbstractAttributeMap;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.Minecraft;

import net.mcreator.sao_legacy.procedure.ProcedureTimerOccupyFunction;
import net.mcreator.sao_legacy.procedure.ProcedureTimerDashStop;
import net.mcreator.sao_legacy.procedure.ProcedureTimerDashStart;
import net.mcreator.sao_legacy.ElementsTheSAOLegacyMod;

import java.util.List;
import java.util.ArrayList;

@ElementsTheSAOLegacyMod.ModElement.Tag
public class PotionTimerDash extends ElementsTheSAOLegacyMod.ModElement {
	@GameRegistry.ObjectHolder("sao_legacy:timerdash")
	public static final Potion potion = null;
	public PotionTimerDash(ElementsTheSAOLegacyMod instance) {
		super(instance, 92);
	}

	@Override
	public void initElements() {
		elements.potions.add(() -> new PotionCustom());
	}
	public static class PotionCustom extends Potion {
		private final ResourceLocation potionIcon;
		public PotionCustom() {
			super(false, -1);
			setRegistryName("timerdash");
			setPotionName("effect.timerdash");
			potionIcon = new ResourceLocation("sao_legacy:textures/mob_effect/timerdash.png");
		}

		@Override
		public boolean isInstant() {
			return false;
		}

		@Override
		public List<ItemStack> getCurativeItems() {
			List<ItemStack> ret = new ArrayList<>();
			return ret;
		}

		@Override
		public boolean shouldRenderInvText(PotionEffect effect) {
			return false;
		}

		@Override
		public boolean shouldRenderHUD(PotionEffect effect) {
			return true;
		}

		@Override
		public void applyAttributesModifiersToEntity(EntityLivingBase entity, AbstractAttributeMap attributeMapIn, int amplifier) {
			World world = entity.world;
			int x = (int) entity.posX;
			int y = (int) entity.posY;
			int z = (int) entity.posZ;
			{
				java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
				$_dependencies.put("entity", entity);
				ProcedureTimerDashStart.executeProcedure($_dependencies);
			}
		}

		@Override
		public void performEffect(EntityLivingBase entity, int amplifier) {
			World world = entity.world;
			int x = (int) entity.posX;
			int y = (int) entity.posY;
			int z = (int) entity.posZ;
			{
				java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				ProcedureTimerOccupyFunction.executeProcedure($_dependencies);
			}
		}

		@Override
		public void removeAttributesModifiersFromEntity(EntityLivingBase entity, AbstractAttributeMap attributeMapIn, int amplifier) {
			super.removeAttributesModifiersFromEntity(entity, attributeMapIn, amplifier);
			World world = entity.world;
			int x = (int) entity.posX;
			int y = (int) entity.posY;
			int z = (int) entity.posZ;
			{
				java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
				$_dependencies.put("entity", entity);
				ProcedureTimerDashStop.executeProcedure($_dependencies);
			}
		}

		@SideOnly(Side.CLIENT)
		@Override
		public void renderHUDEffect(int x, int y, PotionEffect effect, Minecraft mc, float alpha) {
			mc.getTextureManager().bindTexture(potionIcon);
			Gui.drawModalRectWithCustomSizedTexture(x + 3, y + 3, 0, 0, 18, 18, 18, 18);
		}

		@Override
		public boolean isReady(int duration, int amplifier) {
			return true;
		}
	}
}
