
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package tk.turquoisetnt.tntextras.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class TntextrasModTabs {
	public static CreativeModeTab TAB_SIMPLE_EXTRAS;

	public static void load() {
		TAB_SIMPLE_EXTRAS = new CreativeModeTab("tabsimple_extras") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Items.CARROT_ON_A_STICK);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
