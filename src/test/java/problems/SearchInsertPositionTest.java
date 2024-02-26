package problems;

import com.michalgosek.problems.SearchInsertPosition;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class SearchInsertPositionTest {
    static Stream<Arguments> leftmostBinarySearchTestData() {
        return Stream.of(
                arguments(new int[]{1, 3, 5, 7, 8}, 5, 2),
                arguments(new int[]{1, 2, 3, 4, 5, 6, 7}, 0, 0),
                arguments(new int[]{2, 8, 89, 120, 1000}, 120, 3),
                arguments(new int[]{10, 20}, 20, 1),
                arguments(new int[]{1, 2, 3, 4, 5}, 20, 5),
                arguments(new int[]{1, 2, 3, 3, 3, 6, 9}, 7, 6),
                arguments(new int[]{1, 2, 3, 3, 3, 6, 9}, -5, 0),
                arguments(new int[]{1, 2, 3, 3, 3, 6, 9}, 10, 7),
                arguments(new int[]{1, 3, 5, 6}, 5, 2),
                arguments(new int[]{1, 3, 5, 6}, 2, 1),
                arguments(new int[]{1, 3, 5, 6}, 7, 4));
    }

    @ParameterizedTest
    @MethodSource("leftmostBinarySearchTestData")
    public void shouldReturnIndexAccordingToTestData(int[] array, int target, int expectedIndex) {
        // act:
        var index = SearchInsertPosition.searchInsert(array, target);

        // assert:
        assertEquals(expectedIndex, index);
    }
}
