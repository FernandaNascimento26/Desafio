package com.company;
import static org.junit.Assert.assertEquals;

 import org.junit.Test;

public class MedianTest

{
    @Test
    public void testMedian() {
        assertEquals(4, CalculateMedian.main(new int[] {9,7,8,6,4}),0);
    }
}
