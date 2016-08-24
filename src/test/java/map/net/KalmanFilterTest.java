package map.net;

import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by Adriano Dennanni on 07/08/16.
 */
public class KalmanFilterTest  {

    @Test
    public void testKalman() {

        ArrayList<Double> nums = new ArrayList<Double>();

        nums.add(-3.14);
        nums.add(-2.0);
        nums.add(-113.0);

        Double result = KalmanFilter.kalman(nums);
        assert (Math.abs(result - (-4.430216))< 0.0001);


    }
}
