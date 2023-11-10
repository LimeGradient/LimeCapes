package xyz.limegradient.LimeCapes;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EnumPlayerModelParts;
import net.minecraft.init.Blocks;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import xyz.limegradient.LimeCapes.Commands.CapeCommandError;
import xyz.limegradient.LimeCapes.Commands.CapeHelpCommand;
import xyz.limegradient.LimeCapes.Commands.CapeListCommand;
import xyz.limegradient.LimeCapes.Commands.CapeSelectCommand;

@Mod(modid = LimeCapes.MODID, version = LimeCapes.VERSION)
public class LimeCapes
{
    public static final String MODID = "limecapes";
    public static final String VERSION = "1.1";
    
    private static String Cape = null;
    
    public static String getCape() {
    	if (Cape == null) {
    		return "Minecon/2011.png";
    	} else {
    		return Cape + ".png";
    	}
    }
    public static void setCape(String cape) {
    	Cape = cape;
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		// some example code
        System.out.println("DIRT BLOCK >> "+Blocks.dirt.getUnlocalizedName());
        MinecraftForge.EVENT_BUS.register(new EntityWorldJoinListener());
        ClientCommandHandler.instance.registerCommand(new CapeSelectCommand());
        ClientCommandHandler.instance.registerCommand(new CapeHelpCommand());
        ClientCommandHandler.instance.registerCommand(new CapeListCommand());
    }
    
}
