package algorithms.binaryserach.problems;


import com.michalgosek.algorithms.binarysearch.problems.FindMaximumInRotatedSortedArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class FindMaximumInRotatedSortedArrayTest {
    static Stream<Arguments> findMaximumInRotatedSortedArrayTestData() {
        return Stream.of(
                arguments(Arrays.asList(30, 40, 50, 10, 20), 2),
                arguments(Arrays.asList(0, 1, 2, 3, 4, 5), 5),
                arguments(List.of(0), 0),
                arguments(Arrays.asList(1, 2, 3, 5, 8, 0), 4),
                arguments(Arrays.asList(7, 9, 15, 1, 3), 2),
                arguments(Arrays.asList(5, 7, 11, 1, 3), 2),
                arguments(Arrays.asList(1, 1, 1, 2, 2, 3, 4, 5, 6, 6, 6, 6, 8, 9, 9, 9, 10), 16),
                arguments(Arrays.asList(0, 1, 2, 3, 4, 5, 5, 6, 6, 7, 7, 7, 8), 12)
        );
    }

    @ParameterizedTest
    @MethodSource("findMaximumInRotatedSortedArrayTestData")
    public void shouldReturnIndexOfMaximumValueAccordingToTestDataExpectations(List<Integer> array, int expectedIndex) {
        // when:
        var index = FindMaximumInRotatedSortedArray.Solution(array);

        // act:
        assertEquals(expectedIndex, index);
    }
}