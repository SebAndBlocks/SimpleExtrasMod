package tk.turquoisetnt.tntextras.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;

public class SimpleExtrasModCommandProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player && !_player.level.isClientSide())
			_player.displayClientMessage(new TextComponent("Simple Extras by TurquoiseTNT. Made in MCreator with Love and Care"), (false));
	}
}
