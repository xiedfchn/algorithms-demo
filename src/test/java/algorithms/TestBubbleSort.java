package algorithms;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static algorithms.BubbleSort.sort;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBubbleSort {
    @Test
    void testBubbleSort() {
        List<Integer> arr = Arrays.asList(3,1,2,4,5,6,7,9,8);
        sort(arr);
        List<Integer> expectedArr = Arrays.asList(1,2,3,4,5,6,7,8,9);
        assertEquals(expectedArr, arr);
    }
}
