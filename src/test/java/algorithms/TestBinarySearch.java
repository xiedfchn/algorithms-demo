package algorithms;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static algorithms.BinarySearch.findElement;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBinarySearch {

    @Test
    public void shouldReturnIndexIfFound() {
        List<Integer> sortedList= Arrays.asList(1,2,3);
        int result = findElement(sortedList, 0, sortedList.size() - 1, 2);
        assertEquals(1, result);
    }

    @Test
    public void shouldReturnIndexIfNotFound() {
        List<Integer> sortedList= Arrays.asList(1,2,3);
        int result = findElement(sortedList, 0, sortedList.size() - 1, -1);
        assertEquals(-1, result);
    }
}
