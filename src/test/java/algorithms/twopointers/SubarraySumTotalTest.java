package algorithms.twopointers;

import com.michalgosek.algorithms.twopointers.SubarraySumTotal;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class SubarraySumTotalTest {
    static Stream<Arguments> subarraySumTotalTestData() {
        return Stream.of(
                arguments(Arrays.asList(1, 4, 1, 4), 5, 3),
                arguments(Arrays.asList(1, 4, 1, 4), 1, 2),
                arguments(Arrays.asList(1, 4, 1, 4, 1, 4), 6, 2),
                arguments(Arrays.asList(10, 5, -5, -20, 10), -10, 3)
        );
    }

    @ParameterizedTest
    @MethodSource("subarraySumTotalTestData")
    public void shouldReturnTotalSubarrayCountEqualsToTargetAccordingToTestData(List<Integer> numbers, int target, int expectedSubarrayNumbers) {
        // act:
        var totalSubarrayCount = SubarraySumTotal.Solution(numbers, target);

        // arrange:
        assertEquals(expectedSubarrayNumbers, totalSubarrayCount);
    }
}
