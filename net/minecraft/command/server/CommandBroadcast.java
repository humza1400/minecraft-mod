package net.minecraft.command.server;

import java.util.List;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.command.WrongUsageException;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.IChatComponent;

public class CommandBroadcast extends CommandBase
{
    private static final String __OBFID = "CL_00000191";

    public String getCommandName()
    {
        return "say";
    }

    /**
     * Return the required permission level for this command.
     */
    public int getRequiredPermissionLevel()
    {
        return 1;
    }

    public String getCommandUsage(ICommandSender sender)
    {
        return "commands.say.usage";
    }

    public void processCommand(ICommandSender sender, String[] args) throws CommandException
    {
        if (args.length > 0 && args[0].length() > 0)
        {
            IChatComponent var3 = getChatComponentFromNthArg(sender, args, 0, true);
            MinecraftServer.getServer().getConfigurationManager().sendChatMsg(new ChatComponentTranslation("chat.type.announcement", new Object[] {sender.getDisplayName(), var3}));
        }
        else
        {
            throw new WrongUsageException("commands.say.usage", new Object[0]);
        }
    }

    public List addTabCompletionOptions(ICommandSender sender, String[] args, BlockPos pos)
    {
        return args.length >= 1 ? getListOfStringsMatchingLastWord(args, MinecraftServer.getServer().getAllUsernames()) : null;
    }
}