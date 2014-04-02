package me.vaqxine.DonationMechanics.commands;

import me.vaqxine.Main;
import me.vaqxine.DonationMechanics.DonationMechanics;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandAddEC implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		//
		if(sender != null){
			sender.sendMessage("Donation Mechanics currently disabled!");
			return true;
		}
		//
		
		Player ps = null;
		if(sender instanceof Player){
			ps = (Player)sender;
			if(!(ps.isOp())){
				return true;
			}
		}
		final String p_name = args[0];
		final int amount = Integer.parseInt(args[1]);

		// Add <amount> E-CASH to player. (player_database->ecash)

		int current = DonationMechanics.downloadECASH(p_name);
		Main.log.info("[DonationMechanics] Adding " + amount + " ECASH to " + p_name + "'s stash of " + current + " EC!");
		
		current += amount;
		DonationMechanics.setECASH_SQL(p_name, current);
		DonationMechanics.sendPacketCrossServer("[ecash]" + p_name + ":" + current, -1, true);
		
		if(Bukkit.getPlayer(p_name) != null){
			Player pl = Bukkit.getPlayer(p_name);
			pl.sendMessage(ChatColor.GOLD + "  +" + amount + ChatColor.BOLD + " E-CASH");
			pl.playSound(pl.getLocation(), Sound.ORB_PICKUP, 1F, 1F);
		}
		return true;
	}
	
}