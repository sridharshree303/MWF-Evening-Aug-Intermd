package pen.model.ballpen;

import pen.model.BallPen;
import pen.model.Refillable;

public class BitcoPen extends BallPen {

    @Override
    public void write() {
        System.out.println("Written line using Bitco Pen");
    }
}
