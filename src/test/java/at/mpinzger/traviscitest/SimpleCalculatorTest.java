package at.mpinzger.traviscitest;

import org.junit.Assert;

import java.util.Arrays;

public class SimpleCalculatorTest {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.Test
    public void sum() {
        SimpleCalculator sc = new SimpleCalculator(Arrays.asList(3, 5, 8));
        Assert.assertEquals("Sum of 3 + 5 + 8 = 16", sc.sum(), 16);
    }
}
