
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package tk.turquoisetnt.tntextras.init;

import tk.turquoisetnt.tntextras.item.SilverCoinItem;
import tk.turquoisetnt.tntextras.item.RubberItem;
import tk.turquoisetnt.tntextras.item.RedBallonItem;
import tk.turquoisetnt.tntextras.item.GoldCoinItem;
import tk.turquoisetnt.tntextras.item.EmptyColaCanItem;
import tk.turquoisetnt.tntextras.item.ColaItem;
import tk.turquoisetnt.tntextras.item.BouncyBallItem;
import tk.turquoisetnt.tntextras.TntextrasMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

public class TntextrasModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TntextrasMod.MODID);
	public static final RegistryObject<Item> GOLD_COIN = REGISTRY.register("gold_coin", () -> new GoldCoinItem());
	public static final RegistryObject<Item> SILVER_COIN = REGISTRY.register("silver_coin", () -> new SilverCoinItem());
	public static final RegistryObject<Item> COLA = REGISTRY.register("cola", () -> new ColaItem());
	public static final RegistryObject<Item> EMPTY_COLA_CAN = REGISTRY.register("empty_cola_can", () -> new EmptyColaCanItem());
	public static final RegistryObject<Item> RED_BALLON = REGISTRY.register("red_ballon", () -> new RedBallonItem());
	public static final RegistryObject<Item> RUBBER = REGISTRY.register("rubber", () -> new RubberItem());
	public static final RegistryObject<Item> BOUNCY_BALL = REGISTRY.register("bouncy_ball", () -> new BouncyBallItem());
	public static final RegistryObject<Item> OLD_STYLE_TV = block(TntextrasModBlocks.OLD_STYLE_TV, TntextrasModTabs.TAB_SIMPLE_EXTRAS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
