package algorithms.sorting;

import com.michalgosek.algorithms.sorting.BubbleSort;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BubbleSortTest {
    @ParameterizedTest
    @MethodSource("algorithms.sorting.SortingTestDataSource#DataSet")
    public void shouldSortNumbersInAscendingOrder(List<Integer> unsorted, List<Integer> expectedNumbers) {
        // act:
        BubbleSort.Sort(unsorted);

        // assert:
        assertEquals(expectedNumbers, unsorted);
    }
}