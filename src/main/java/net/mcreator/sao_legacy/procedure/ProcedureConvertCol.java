package net.mcreator.sao_legacy.procedure;

import net.minecraft.item.ItemStack;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.Container;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.Entity;

import net.mcreator.sao_legacy.item.ItemColPouch;
import net.mcreator.sao_legacy.ElementsTheSAOLegacyMod;

import java.util.function.Supplier;
import java.util.Random;
import java.util.Map;

@ElementsTheSAOLegacyMod.ModElement.Tag
public class ProcedureConvertCol extends ElementsTheSAOLegacyMod.ModElement {
	public ProcedureConvertCol(ElementsTheSAOLegacyMod instance) {
		super(instance, 71);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure ConvertCol!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double slotNumber = 0;
		if (entity instanceof EntityPlayerMP) {
			Container _current = ((EntityPlayerMP) entity).openContainer;
			if (_current instanceof Supplier) {
				Object invobj = ((Supplier) _current).get();
				if (invobj instanceof Map) {
					ItemStack _setstack = new ItemStack(ItemColPouch.block, (int) (1));
					_setstack.setCount(1);
					((Slot) ((Map) invobj).get((int) (16))).putStack(_setstack);
					_current.detectAndSendChanges();
				}
			}
		}
		if (entity instanceof EntityPlayerMP) {
			Container _current = ((EntityPlayerMP) entity).openContainer;
			if (_current instanceof Supplier) {
				Object invobj = ((Supplier) _current).get();
				if (invobj instanceof Map) {
					ItemStack stack = ((Slot) ((Map) invobj).get((int) (16))).getStack();
					if (stack != null) {
						if (stack.attemptDamageItem((int) 1024, new Random(), null)) {
							stack.shrink(1);
							stack.setItemDamage(0);
						}
						_current.detectAndSendChanges();
					}
				}
			}
		}
		slotNumber = (double) 0;
		while (((slotNumber) <= 15)) {
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack stack = ((Slot) ((Map) invobj).get((int) (16))).getStack();
						if (stack != null) {
							if (stack.attemptDamageItem((int) (0 - (new Object() {
								public int getAmount(int sltid) {
									if (entity instanceof EntityPlayerMP) {
										Container _current = ((EntityPlayerMP) entity).openContainer;
										if (_current instanceof Supplier) {
											Object invobj = ((Supplier) _current).get();
											if (invobj instanceof Map) {
												ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
												if (stack != null)
													return stack.getCount();
											}
										}
									}
									return 0;
								}
							}.getAmount((int) ((slotNumber))))), new Random(), null)) {
								stack.shrink(1);
								stack.setItemDamage(0);
							}
							_current.detectAndSendChanges();
						}
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						((Slot) ((Map) invobj).get((int) ((slotNumber)))).putStack(ItemStack.EMPTY);
						_current.detectAndSendChanges();
					}
				}
			}
			slotNumber = (double) ((slotNumber) + 1);
		}
	}
}
