package darkevilmac.movingworld.common.handler.tickable;

import darkevilmac.movingworld.MovingWorld;
import darkevilmac.movingworld.common.chunk.assembly.AssembleResult;

public class AssembleResultTickable implements ITickable {

    public AssembleResult result;

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

    @Override
    public void run() {
        for (int i = 0; i < MovingWorld.instance.mConfig.maxAssemblePerTick; i++) {

        }
    }
}
