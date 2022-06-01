package tk.turquoisetnt.tntextras.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;

public class WhatIsKLCommandExecutedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player && !_player.level.isClientSide())
			_player.displayClientMessage(
					new TextComponent(
							"KL stands for Kids Learning and is used whenever something of focused on teaching a lesson / a point about something."),
					(false));
	}
}
