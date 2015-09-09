package darkevilmac.movingworld.common.chunk.assembly;

import darkevilmac.movingworld.common.entity.EntityMovingWorld;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public interface IAssembleResultReceiver {

    void recieveEntity(AssembleResult result, World world, EntityPlayer requester, EntityMovingWorld movingWorld);

}
