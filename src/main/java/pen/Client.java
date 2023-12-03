package pen;

import pen.model.BallPen;
import pen.model.ballpen.BitcoPen;
import pen.model.ballpen.WritoMeter;

public class Client {
    public static void main(String[] args) {
        BallPen bitco = new BitcoPen();
        BallPen writoMeter = new WritoMeter();
        bitco.write();
        writoMeter.write();
    }
}
