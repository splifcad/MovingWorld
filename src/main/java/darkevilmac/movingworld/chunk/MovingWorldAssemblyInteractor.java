package darkevilmac.movingworld.chunk;

import darkevilmac.movingworld.MovingWorld;
import darkevilmac.movingworld.block.BlockMovingWorldMarker;
import darkevilmac.movingworld.block.TileMovingWorldMarkingBlock;
import darkevilmac.movingworld.entity.MovingWorldCapabilities;
import io.netty.buffer.ByteBuf;
import net.minecraft.block.Block;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

/**
 * Used for storing information given by and taken by the (Dis)Assembler
 * <p/>
 * Mostly for use in GUIs, the ship pretty much immediately forgets this thing.
 */
public class MovingWorldAssemblyInteractor {

    public MovingWorldAssemblyInteractor fromByteBuf(byte resultCode, ByteBuf byteBuf) {
        return new MovingWorldAssemblyInteractor();
    }

    public MovingWorldAssemblyInteractor fromByteBuf(ByteBuf byteBuf) {
        return fromByteBuf((byte) AssembleResult.RESULT_OK, byteBuf);
    }

    public MovingWorldAssemblyInteractor fromNBT(NBTTagCompound tag, World world) {
        return new MovingWorldAssemblyInteractor();
    }

    public boolean doDiagonalAssembly() {
        return MovingWorld.instance.mConfig.diagonalAssembly;
    }

    public void toByteBuf(ByteBuf byteBuf) {
    }

    /**
     * Called when a block is assembled to your moving world.
     */
    public void blockAssembled(LocatedBlock locatedBlock) {
    }

    /**
     * Called when a block is disassembled to your moving world.
     */
    public void blockDisassembled(LocatedBlock locatedBlock) {
    }

    /**
     * @return returns if it is an over writable block in the config.
     */
    public boolean canOverwriteBlock(Block block) {
        //TODO: implement over writable blocks in config file!
        return false;
    }

    /**
     * Called when a block is overwritten when a moving world is disassembled.
     */
    public void blockOverwritten(Block block) {
    }

    /**
     * Called when a block is rotated during disassembling.
     */
    public void blockRotated(Block block, World world, int x, int y, int z, int deltarot) {
    }

    /**
     * Called when a chunk assembly has finished.
     */
    public void chunkAssembled(AssembleResult assembleResult) {
    }

    /**
     * Called when a chunk disassembly has finished.
     */
    public void chunkDissasembled(AssembleResult assembleResult) {
    }

    public boolean isBlockAllowed(World world, Block block, int x, int y, int z) {
        return !block.isAir(world, x, y, z) && !block.getMaterial().isLiquid();
    }

    public boolean isBlockMovingWorldMarker(Block block) {
        return block != null && block instanceof BlockMovingWorldMarker;
    }

    public boolean isTileMovingWorldMarker(TileEntity tile) {
        return tile != null && tile instanceof TileMovingWorldMarkingBlock;
    }

    /**
     * Use this method to transfer information to your moving world capabilities. (use methods in your capabilities, assembly interactors are for display stuffs.)
     */
    @Deprecated
    public MovingWorldCapabilities transferToCapabilities(MovingWorldCapabilities capabilities) {
        return capabilities;
    }

    /**
     * Recommended to call writeNBTMetadata first, then write the rest of your data.
     *
     * @param compound
     */
    public void writeNBTFully(NBTTagCompound compound) {
    }


    /**
     * Write metadata to NBT.
     *
     * @param compound
     */
    public void writeNBTMetadata(NBTTagCompound compound) {
    }

}