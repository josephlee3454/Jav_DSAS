package insertShift;
import org.junit.Test;

import static org.junit.Assert.*;
public class BinarySearchTest {
    @Test
    public void binarySearch() {
        assertEquals(3, BinarySearch.binarySearch(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 4));
        System.out.println("TEST PASSES IF NUMBER FOUND");
    }
}
