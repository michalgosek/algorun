package algorithms.twopointers;

import com.michalgosek.algorithms.twopointers.SubarraySumShortest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class SubarraySumShortestTest {
    static Stream<Arguments> subarraySumShortestTestData() {
        return Stream.of(
                arguments(Arrays.asList(1, 4, 1, 7, 3, 0, 2, 5), 10, 2),
                arguments(Arrays.asList(1, 6, 3, 1, 2, 4, 5), 10, 3),
                arguments(Arrays.asList(1, 6, 3, 1, 2, 4, 5), 3, 1),
                arguments(Arrays.asList(1, 6, 3, 1, 2, 4, 5), 7, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("subarraySumShortestTestData")
    public void shouldReturnShortestSubarraySizeAccordingToTestData(List<Integer> numbers, int target, int expectedSubarraySize) {
        // act:
        var subarraySize = SubarraySumShortest.Solution(numbers, target);

        // arrange:
        assertEquals(expectedSubarraySize, subarraySize);
    }
}
