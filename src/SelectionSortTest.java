import static org.junit.Assert.*;

import org.junit.Test;

public class SelectionSortTest {

	@Test
    public void testPositive() {
        SelectionSort sort = new SelectionSort();
        int[] actual = {5, 1, 4, 2, 8};
        int[] expected = {1, 2, 4, 5, 8};
        sort.selectionSort(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testNegatives() {
        SelectionSort sort = new SelectionSort();
        int[] actual = {-1, -3, -4, -2, -5};
        int[] expected = {-5, -4, -3, -2, -1};
        sort.selectionSort(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testMixed() {
        SelectionSort sort = new SelectionSort();
        int[] actual = {0, -1, 5, -3, 2};
        int[] expected = {-3, -1, 0, 2, 5};
        sort.selectionSort(actual);
        assertArrayEquals(expected, actual);
    }



}
