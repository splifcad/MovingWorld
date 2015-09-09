package darkevilmac.movingworld.common.handler.tickable;

import darkevilmac.movingworld.MovingWorld;
import darkevilmac.movingworld.common.chunk.assembly.ChunkDisassembler;

public class ChunkDisassemblerTickable implements ITickable {

    public ChunkDisassembler disassembler;

    @Override
    public void run() {
        for (int i = 0; i < MovingWorld.instance.mConfig.maxDisassemblePerTick; i++) {

        }
    }

    @Override
    public void start() {

    }

    @Override
    public boolean isComplete() {
        return false;
    }

    @Override
    public void finish() {

    }
}
