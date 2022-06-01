
/*
*    MCreator note: This file will be REGENERATED on each build.
*/
package tk.turquoisetnt.tntextras.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.entity.npc.VillagerProfession;

import java.util.List;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class TntextrasModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
		if (event.getType() == VillagerProfession.TOOLSMITH) {
			trades.get(1).add(new BasicItemListing(new ItemStack(TntextrasModItems.GOLD_COIN.get(), 6),

					new ItemStack(Items.EMERALD), 10, 5, 0.05f));
			trades.get(1).add(new BasicItemListing(new ItemStack(TntextrasModItems.SILVER_COIN.get(), 18),

					new ItemStack(Items.EMERALD), 10, 5, 0.05f));
			trades.get(1).add(new BasicItemListing(new ItemStack(TntextrasModItems.SILVER_COIN.get(), 13),
					new ItemStack(TntextrasModItems.GOLD_COIN.get(), 3), new ItemStack(Items.EMERALD, 2), 10, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.BUTCHER) {
			trades.get(1).add(new BasicItemListing(new ItemStack(TntextrasModItems.GOLD_COIN.get(), 5),

					new ItemStack(TntextrasModItems.COLA.get()), 10, 5, 0.05f));
			trades.get(1).add(new BasicItemListing(new ItemStack(TntextrasModItems.COLA.get()), new ItemStack(TntextrasModItems.SILVER_COIN.get(), 2),
					new ItemStack(TntextrasModItems.COLA.get()), 10, 5, 0.05f));
		}
	}
}
