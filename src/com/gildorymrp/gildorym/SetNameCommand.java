package com.gildorymrp.gildorym;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import com.earth2me.essentials.Essentials;

public class SetnameCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		String name;
		Essentials essentials = (Essentials) Bukkit.getServer().getPluginManager().getPlugin("Essentials");
		
		if (args.length <= 5){
			if (args.length == 1){
				essentials.getUserMap().getUser(sender.getName()).setNickname(args[0]);
				name = essentials.getUser(sender).getNickname();
				sender.sendMessage(ChatColor.DARK_AQUA + "name changed: " + name);
				return true;
			}else if(args.length == 2){
				essentials.getUserMap().getUser(sender.getName()).setNickname(args[0] + " " + args[1]);
				name = essentials.getUser(sender).getNickname();
				sender.sendMessage(ChatColor.DARK_AQUA + "name changed: " + name);
				return true;
			}else if(args.length == 3){
				essentials.getUserMap().getUser(sender.getName()).setNickname(args[0] + " " + args[1] + " " + args[2]);
				name = essentials.getUser(sender).getNickname();
				sender.sendMessage(ChatColor.DARK_AQUA + "name changed: " + name);
				return true;
			}else if(args.length == 4){
				essentials.getUserMap().getUser(sender.getName()).setNickname(args[0] + " " + args[1] + " " + args[2] + " " + args[3]);
				name = essentials.getUser(sender).getNickname();
				sender.sendMessage(ChatColor.DARK_AQUA + "name changed: " + name);
				return true;
			}else if(args.length == 5){
				essentials.getUserMap().getUser(sender.getName()).setNickname(args[0] + " " + args[1] + " " + args[2] + " " + args[3] + " " + args[4]);
				name = essentials.getUser(sender).getNickname();
				sender.sendMessage(ChatColor.DARK_AQUA + "name changed: " + name);
				return true;
			}else{
				sender.sendMessage(ChatColor.DARK_RED + "illegal argument amount");
				return false;
			}
		}
		return false;	
	}
}
	