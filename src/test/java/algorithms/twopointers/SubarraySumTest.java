package algorithms.twopointers;

import com.michalgosek.algorithms.twopointers.SubarraySum;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class SubarraySumTest {
    static Stream<Arguments> SubarraySumTestData() {
        return Stream.of(
                arguments(Arrays.asList(1, 3, -3, 8, 5, 7), 1, List.of(0, 1)),
                arguments(Arrays.asList(1, 3, -3, 8, 5, 7), 5, List.of(2, 4)),
                arguments(Arrays.asList(1, 3, -3, 8, 5, 7), 12, List.of(4, 6)),
                arguments(Arrays.asList(1, 3, -3, 8, 5, 7), 4, List.of(0, 2))
        );
    }

    @ParameterizedTest
    @MethodSource("SubarraySumTestData")
    public void shouldReturnSubarrayIndicesAccordingToTestData(List<Integer> numbers, int target, List<Integer> expectedIndices) {
        // act:
        var subarrayIndices = SubarraySum.Solution(numbers, target);

        // arrange:
        assertEquals(expectedIndices, subarrayIndices);
    }
}
