package me.comu.client.events;

import me.comu.api.event.Event;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;

public class BlockClickedEvent extends Event
{
    private BlockPos blockPos;
    private EnumFacing enumFacing;

    public BlockClickedEvent(BlockPos blockPos, EnumFacing enumFacing)
    {
        this.blockPos = blockPos;
        this.enumFacing = enumFacing;
    }

    public BlockPos getBlockPos()
    {
        return blockPos;
    }

    public void setBlockPos(BlockPos blockPos)
    {
        this.blockPos = blockPos;
    }

    public EnumFacing getEnumFacing()
    {
        return enumFacing;
    }

    public void setEnumFacing(EnumFacing enumFacing)
    {
        this.enumFacing = enumFacing;
    }
}
