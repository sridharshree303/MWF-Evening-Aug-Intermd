package pen.model.gelpen;

import pen.model.GelPen;
import pen.model.Refillable;

public class AddGelPen extends GelPen implements Refillable {
    @Override
    public void write() {
        System.out.println("Written line using AddGel Pen");
    }

    @Override
    public boolean refill() {
        System.out.println("ButterFlowPen Refilled");
        return true;
    }
}
