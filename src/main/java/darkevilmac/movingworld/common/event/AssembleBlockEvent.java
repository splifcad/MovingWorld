package darkevilmac.movingworld.common.event;

import darkevilmac.movingworld.common.chunk.LocatedBlock;
import net.minecraftforge.fml.common.eventhandler.Event;

/**
 * Created by DarkEvilMac on 2/22/2015.
 */

public class AssembleBlockEvent extends Event {

    public LocatedBlock block;

    public AssembleBlockEvent(LocatedBlock block) {
        this.block = block;
    }

}