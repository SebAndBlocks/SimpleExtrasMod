
package tk.turquoisetnt.tntextras.item;

import tk.turquoisetnt.tntextras.procedures.BouncyBallItemInHandTickProcedure;
import tk.turquoisetnt.tntextras.init.TntextrasModTabs;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

public class BouncyBallItem extends Item {
	public BouncyBallItem() {
		super(new Item.Properties().tab(TntextrasModTabs.TAB_SIMPLE_EXTRAS).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			BouncyBallItemInHandTickProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ());
	}
}
