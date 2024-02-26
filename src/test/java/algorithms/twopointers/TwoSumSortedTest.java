package algorithms.twopointers;

import com.michalgosek.algorithms.twopointers.TwoSumSorted;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoSumSortedTest {
    @MethodSource
    static Stream<Arguments> twoSumSortedTestData() {
        return Stream.of(
                Arguments.arguments(Arrays.asList(100, 1000, 2001, 3000, 4000, 5000), 5001, Arrays.asList(2, 3)),
                Arguments.arguments(Arrays.asList(2, 3, 5, 8, 11, 15), 5, Arrays.asList(0, 1)),
                Arguments.arguments(Arrays.asList(2, 5, 10, 12, 30, 100), 22, Arrays.asList(2, 3)),
                Arguments.arguments(Arrays.asList(1, 2, 3, 10, 20, 30, 50, 100), 101, Arrays.asList(0, 7)),
                Arguments.arguments(Arrays.asList(1, 2), 3, Arrays.asList(0, 1)),
                Arguments.arguments(Arrays.asList(1, 2, 3, 4, 5, 6), 4, Arrays.asList(0, 2))
        );
    }

    @ParameterizedTest
    @MethodSource("twoSumSortedTestData")
    public void shouldReturnIndicesAccordingToTestData(List<Integer> numbers, int target, List<Integer> expectedIndices) {
        // act:
        var indices = TwoSumSorted.Solution(numbers, target);

        // assert:
        assertEquals(expectedIndices, indices);
    }
}
