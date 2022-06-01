
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package tk.turquoisetnt.tntextras.init;

import tk.turquoisetnt.tntextras.item.SilverCoinItem;
import tk.turquoisetnt.tntextras.item.GoldCoinItem;
import tk.turquoisetnt.tntextras.item.EmptyColaCanItem;
import tk.turquoisetnt.tntextras.item.ColaItem;
import tk.turquoisetnt.tntextras.TntextrasMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

public class TntextrasModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TntextrasMod.MODID);
	public static final RegistryObject<Item> GOLD_COIN = REGISTRY.register("gold_coin", () -> new GoldCoinItem());
	public static final RegistryObject<Item> SILVER_COIN = REGISTRY.register("silver_coin", () -> new SilverCoinItem());
	public static final RegistryObject<Item> COLA = REGISTRY.register("cola", () -> new ColaItem());
	public static final RegistryObject<Item> EMPTY_COLA_CAN = REGISTRY.register("empty_cola_can", () -> new EmptyColaCanItem());
}
