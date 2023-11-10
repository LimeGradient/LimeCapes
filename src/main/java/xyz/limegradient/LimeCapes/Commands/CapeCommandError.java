package xyz.limegradient.LimeCapes.Commands;

import net.minecraft.client.Minecraft;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ChatStyle;
import net.minecraft.util.EnumChatFormatting;

public class CapeCommandError {
	public static void ThrowError(String msg) {
		Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText(String.format("LimeCapes Error: %s", msg)).setChatStyle(new ChatStyle().setColor(EnumChatFormatting.RED)));
	}
}
