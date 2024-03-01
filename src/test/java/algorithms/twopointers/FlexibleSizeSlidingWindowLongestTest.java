package algorithms.twopointers;

import com.michalgosek.algorithms.twopointers.FlexibleSizeSlidingWindowLongest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class FlexibleSizeSlidingWindowLongestTest {
    static Stream<Arguments> flexibleSizeSlidingWindowLongestTestData() {
        return Stream.of(
                arguments(Arrays.asList(1, 6, 3, 1, 2, 4, 5), 10, 4),
                arguments(Arrays.asList(1, 6, 3, 1, 2, 4, 5), 22, 7),
                arguments(Arrays.asList(1, 6, 3, 1, 2, 4, 5), 12, 4),
                arguments(Arrays.asList(1, 6, 3, 1, 2, 4, 5), 7, 3)
        );
    }

    @ParameterizedTest
    @MethodSource("flexibleSizeSlidingWindowLongestTestData")
    public void shouldReturnSubarraySizeAccordingToTestData(List<Integer> numbers, int target, int expectedSubarrayLength) {
        // act:
        var subarrayLength = FlexibleSizeSlidingWindowLongest.subarraySumLongest(numbers, target);

        // assert:
        assertEquals(expectedSubarrayLength, subarrayLength);
    }
}
