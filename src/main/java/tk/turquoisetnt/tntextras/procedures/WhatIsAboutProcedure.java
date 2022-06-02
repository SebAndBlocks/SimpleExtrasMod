package tk.turquoisetnt.tntextras.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;

public class WhatIsAboutProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player && !_player.level.isClientSide())
			_player.displayClientMessage(new TextComponent("This is a few commands from the SimpleExtrasMod to help you understand certain items."),
					(false));
		if (entity instanceof Player _player && !_player.level.isClientSide())
			_player.displayClientMessage(new TextComponent("Thanks for Using The SimpleExtrasMod! from TurquoiseTNT (The Developer)"), (false));
	}
}
