package com.github.finalneuron.learnmore.blocks;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IWorldPosCallable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.items.CapabilityItemHandler;

import static com.github.finalneuron.learnmore.blocks.ModBlocks.FIRSTBLOCK_CONTAINER;

public class FirstBlockContainer extends Container {

    private TileEntity tileEntity;
    private PlayerEntity player;

    public FirstBlockContainer(int id, World world, BlockPos pos, PlayerInventory inv, PlayerEntity player) {
        super(FIRSTBLOCK_CONTAINER, id);
        tileEntity = world.getTileEntity(pos);
        tileEntity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY);
        this.player = player;
    }

    @Override
    public boolean canInteractWith(PlayerEntity playerIn) {
        return isWithinUsableDistance(IWorldPosCallable.of(tileEntity.getWorld(), tileEntity.getPos()), player, ModBlocks.FIRSTBLOCK);
    }
}
