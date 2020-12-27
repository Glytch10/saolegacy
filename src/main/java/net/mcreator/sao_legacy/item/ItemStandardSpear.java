
package net.mcreator.sao_legacy.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.state.IBlockState;

import net.mcreator.sao_legacy.creativetab.TabSAOFI;
import net.mcreator.sao_legacy.ElementsTheSAOLegacyMod;

import com.google.common.collect.Multimap;

@ElementsTheSAOLegacyMod.ModElement.Tag
public class ItemStandardSpear extends ElementsTheSAOLegacyMod.ModElement {
	@GameRegistry.ObjectHolder("sao_legacy:standardspear")
	public static final Item block = null;
	public ItemStandardSpear(ElementsTheSAOLegacyMod instance) {
		super(instance, 20);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemToolCustom() {
		}.setUnlocalizedName("standardspear").setRegistryName("standardspear").setCreativeTab(TabSAOFI.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("sao_legacy:standardspear", "inventory"));
	}
	private static class ItemToolCustom extends Item {
		protected ItemToolCustom() {
			setMaxDamage(0);
			setMaxStackSize(1);
		}

		@Override
		public Multimap<String, AttributeModifier> getItemAttributeModifiers(EntityEquipmentSlot equipmentSlot) {
			Multimap<String, AttributeModifier> multimap = super.getItemAttributeModifiers(equipmentSlot);
			if (equipmentSlot == EntityEquipmentSlot.MAINHAND) {
				multimap.put(SharedMonsterAttributes.ATTACK_DAMAGE.getName(),
						new AttributeModifier(ATTACK_DAMAGE_MODIFIER, "Tool modifier", 2.1000000000000005f, 0));
				multimap.put(SharedMonsterAttributes.ATTACK_SPEED.getName(), new AttributeModifier(ATTACK_SPEED_MODIFIER, "Tool modifier", -2.8, 0));
			}
			return multimap;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, IBlockState par2Block) {
			IBlockState require;
			return 0;
		}

		@Override
		public boolean onBlockDestroyed(ItemStack stack, World worldIn, IBlockState state, BlockPos pos, EntityLivingBase entityLiving) {
			stack.damageItem(1, entityLiving);
			return true;
		}

		@Override
		public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
			stack.damageItem(2, attacker);
			return true;
		}

		@Override
		public boolean isFull3D() {
			return true;
		}

		@Override
		public int getItemEnchantability() {
			return 2;
		}
	}
}
