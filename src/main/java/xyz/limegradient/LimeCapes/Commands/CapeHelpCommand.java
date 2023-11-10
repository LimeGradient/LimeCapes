
package xyz.limegradient.LimeCapes.Commands;

import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatComponentText;
import xyz.limegradient.LimeCapes.LimeCapes;

public class CapeHelpCommand extends CommandBase{
	@Override
	public String getCommandName() {
		// TODO Auto-generated method stub
		return "chelp";
	}

	@Override
	public String getCommandUsage(ICommandSender arg0) {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public void processCommand(ICommandSender arg0, String[] arg1) throws CommandException {
		String newline = System.getProperty("line.separator");
		Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("LimeCape Commands:" + newline + "/cc <Category> <Cape> - Changes your cape" + newline + "/clist <Category> - Lists capes in a category"));
	}
	
	@Override
    public int getRequiredPermissionLevel() {
        return 0;
    }
}
