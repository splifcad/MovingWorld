package darkevilmac.movingworld.common.handler.tickable;

public interface ITickable extends Runnable {

    void start();

    boolean isComplete();

    void finish();

}
