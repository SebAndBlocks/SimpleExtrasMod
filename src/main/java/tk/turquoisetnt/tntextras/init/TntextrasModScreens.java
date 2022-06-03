
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package tk.turquoisetnt.tntextras.init;

import tk.turquoisetnt.tntextras.client.gui.TVGUIDEScreen;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class TntextrasModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(TntextrasModMenus.TVGUIDE, TVGUIDEScreen::new);
		});
	}
}
