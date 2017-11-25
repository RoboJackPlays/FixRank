package net.ajgaming.fixrank;

import org.bukkit.plugin.java.JavaPlugin;
// import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class Main extends JavaPlugin implements Listener {

	@Override
	public void onEnable() {
		System.out.println("AJGaming Rank-Fix Enabled.");
		Bukkit.getPluginManager().registerEvents(this, this);
	}

	public String colorize(String msg) {
		String coloredMsg = "";
		for (int i = 0; i < msg.length(); i++) {
			if (msg.charAt(i) == '&')
				coloredMsg += '§';
			else
				coloredMsg += msg.charAt(i);
		}
		return coloredMsg;
	}

	@EventHandler
	public void onJoin(PlayerJoinEvent j) {

		Player player = j.getPlayer();

		if (!(player.hasPermission("ajgaming.rankfix"))) {
		 getServer().dispatchCommand(getServer().getConsoleSender(), "lp user " + player.getName() + " parent add User server=vanilla");
//			 new BukkitRunnable() {
	//		 public void run () {
		//	 getServer().dispatchCommand(getServer().getConsoleSender(), "nm reload");
			// }
			 
			
			 //} .runTaskLater(this, 20l);

		}
	}

}
