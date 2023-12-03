package pen.model.ballpen;

import pen.model.BallPen;
import pen.model.Refillable;

public class WritoMeter extends BallPen implements Refillable {
    @Override
    public void write() {
        System.out.println("Written line using WritoMeterPen");
    }

    @Override
    public boolean refill() {
        System.out.println("WritoMeter Pen Refilled");
        return true;
    }
}
