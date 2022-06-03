
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package tk.turquoisetnt.tntextras.init;

import tk.turquoisetnt.tntextras.block.OldStyleTVBlock;
import tk.turquoisetnt.tntextras.TntextrasMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

public class TntextrasModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TntextrasMod.MODID);
	public static final RegistryObject<Block> OLD_STYLE_TV = REGISTRY.register("old_style_tv", () -> new OldStyleTVBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			OldStyleTVBlock.registerRenderLayer();
		}
	}
}
