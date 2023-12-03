package pen.model.ballpen;

import pen.model.BallPen;
import pen.model.Refillable;

public class ButterFlowPen extends BallPen implements Refillable {
    @Override
    public void write() {
        System.out.println("Written line using ButterFlow Pen");
    }

    @Override
    public boolean refill() {
        System.out.println("ButterFlowPen Refilled");
        return true;
    }
}
