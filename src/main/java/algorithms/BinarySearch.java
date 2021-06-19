package algorithms;

import java.util.List;


public class BinarySearch {

    public static int findElement(List<Integer> sortedList, int firstIndex, int lastIndex, int value) {
        int midIndex = (firstIndex + lastIndex) / 2 ;

        if(firstIndex < lastIndex) {
            if(sortedList.get(midIndex).equals(value)) {
                return midIndex;
            } else if(sortedList.get(midIndex) < value) {
                return findElement(sortedList, midIndex + 1, lastIndex, value);
            } else if(sortedList.get(midIndex) > value) {
                return findElement(sortedList, firstIndex, midIndex - 1, value);
            }
        }

        return -1;
    }
}
