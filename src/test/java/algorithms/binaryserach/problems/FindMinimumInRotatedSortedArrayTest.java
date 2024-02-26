package algorithms.binaryserach.problems;

import com.michalgosek.algorithms.binarysearch.problems.FindMinimumInRotatedSortedArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class FindMinimumInRotatedSortedArrayTest {
    static Stream<Arguments> findMinimumInRotatedSortedArrayTestData() {
        return Stream.of(
                arguments(Arrays.asList(30, 40, 50, 10, 20), 3),
                arguments(Arrays.asList(0, 1, 2, 3, 4, 5), 0),
                arguments(List.of(0), 0),
                arguments(Arrays.asList(1, 2, 3, 5, 8, 0), 5)
        );
    }

    @ParameterizedTest
    @MethodSource("findMinimumInRotatedSortedArrayTestData")
    public void shouldReturnIndexOfMinimumValueAccordingToTestDataExpectations(List<Integer> array, int expectedIndex) {
        // act:
        var index = FindMinimumInRotatedSortedArray.Solution(array);

        // act:
        assertEquals(expectedIndex, index);
    }
}