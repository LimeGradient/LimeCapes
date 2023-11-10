package xyz.limegradient.LimeCapes.Commands;

import java.util.Arrays;

import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatComponentText;

public class CapeListCommand extends CommandBase{
	private String[] MineconCapes = {"2011", "2012", "2013", "2015", "2016", "Unused1", "Unused2", "Unused3"};
	private String[] JavaCapes = {"1Millionth", "Bacon", "BugTracker", "Cheapsh0t", "CherryBlossom", "ChineseTranslator", "Cobalt", "CrowdinTranslator", "dannyBstyle", "Gr8Escape", "JulianClark", "Migrator", "MojangStudios", "MrMessiah", "NewMojang", "NewYears", "OldMojang", "Prismarine", "Realms", "Scrolls", "Turtle", "ValentineCape", "Vanilla", "XboxBirthday", "Xmas"};
	private String[] BedrockCapes = {"Marketplace", "Pancape", "Pride"};
	
	@Override
	public String getCommandName() {
		// TODO Auto-generated method stub
		return "clist";
	}

	@Override
	public String getCommandUsage(ICommandSender arg0) {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public void processCommand(ICommandSender arg0, String[] arg1) throws CommandException {
		String newline = System.getProperty("line.separator");
		if (arg1.length == 0) {
			Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("Cape Categories" + newline + "Minecon" + newline + "Java" + newline + "Bedrock"));
		} else {
			if (arg1[0].equalsIgnoreCase("Minecon")) {
				for (String cape : MineconCapes) {
					Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText(cape));
				}
			}
			if (arg1[0].equalsIgnoreCase("Java")) {
				for (String cape : JavaCapes) {
					Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText(cape));
				}
			}
			if (arg1[0].equalsIgnoreCase("Bedrock")) {
				for (String cape : BedrockCapes) {
					Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText(cape));
				}
			}
		}
	}
	
	@Override
    public int getRequiredPermissionLevel() {
        return 0;
    }
}
