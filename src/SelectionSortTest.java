import static org.junit.Assert.*;

import org.junit.Test;

public class SelectionSortTest {

	@Test
    public void testPositive() {
		SelectionSort sort = new SelectionSort();
	    int[] actual = {34, 8, 64, 51, 32, 21};
	    int[] expected = {8, 21, 32, 34, 51, 64};
	    sort.selectionSort(actual);
	    assertArrayEquals(expected, actual);
    }
    @Test
    public void testNegatives() {
    	SelectionSort sort = new SelectionSort();
        int[] actual = {-7, -15, -3, -100, -22};
        int[] expected = {-100, -22, -15, -7, -3};
        sort.selectionSort(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testMixed() {
    	SelectionSort sort = new SelectionSort();
        int[] actual = {0, 5, -15, 7, -3, 2};
        int[] expected = {-15, -3, 0, 2, 5, 7};
        sort.selectionSort(actual);
        assertArrayEquals(expected, actual);
    }



}
