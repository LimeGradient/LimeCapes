package xyz.limegradient.LimeCapes.Commands;

import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ChatStyle;
import net.minecraft.util.EnumChatFormatting;
import xyz.limegradient.LimeCapes.LimeCapes;

public class CapeSelectCommand extends CommandBase{

	@Override
	public String getCommandName() {
		// TODO Auto-generated method stub
		return "cc";
	}

	@Override
	public String getCommandUsage(ICommandSender arg0) {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public void processCommand(ICommandSender arg0, String[] arg1) throws CommandException {
		if (arg1.length < 2 && !arg1[0].equals("help")) {
			CapeCommandError.ThrowError("Not Enough Arguments (ex. /cc Minecon 2011)");
		}
		LimeCapes.setCape(String.format("%s/%s", arg1[0], arg1[1]));
		String newline = System.getProperty("line.separator");
		
		if (arg1[0].equals("help")) {
			Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("LimeCape Commands:" + newline + "/cc <Category> <Cape> - Changes your cape" + newline + "/cc list <Category> - Lists capes in a category"));
		}
	}
	
	@Override
    public int getRequiredPermissionLevel() {
        return 0;
    }
	
}
