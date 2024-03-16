package algorithms.twopointers;

import com.michalgosek.algorithms.twopointers.FixedSizeSlidingWindow;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class FixedSizeSlidingWindowTest {
    static Stream<Arguments> fixedSizeSlidingWindowTestData() {
        return Stream.of(
                arguments(Arrays.asList(1, 2, 3, 7, 4, 1), 5, 17),
                arguments(Arrays.asList(1, 2, 3, 7, 4, 1), 2, 11),
                arguments(Arrays.asList(1, 2, 3, 7, 4, 1), 3, 14),
                arguments(Arrays.asList(1, 2, 3, 7, 4, 1), 4, 16),
                arguments(Arrays.asList(1, 2, 3, 7, 4, 1), 1, 7)
        );
    }

    @ParameterizedTest
    @MethodSource("fixedSizeSlidingWindowTestData")
    public void shouldReturnIndexAccordingToTestData(List<Integer> numbers, int windowSize, int expectedSubarrayMaxSum) {
        // act:
        var subarrayMaxSum = FixedSizeSlidingWindow.Solution(numbers, windowSize);

        // assert:
        assertEquals(expectedSubarrayMaxSum, subarrayMaxSum);
    }
}
