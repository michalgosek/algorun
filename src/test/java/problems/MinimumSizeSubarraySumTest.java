package problems;

import com.michalgosek.problems.MinimumSizeSubarraySum;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MinimumSizeSubarraySumTest {
    static Stream<Arguments> minimumSizeSubarraySumTestData() {
        return Stream.of(
                arguments(new int[]{2, 3, 1, 2, 4, 3}, 7, 2),
                arguments(new int[]{1, 4, 4}, 4, 1),
                arguments(new int[]{1, 1, 1, 1, 1, 1, 1, 1}, 11, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("minimumSizeSubarraySumTestData")
    public void shouldReturnIndexAccordingToTestData(int[] nums, int target, int expectedSubarraySize) {
        // act:
        var minimumSubarraySize = MinimumSizeSubarraySum.Solution(target, nums);

        // assert:
        assertEquals(expectedSubarraySize, minimumSubarraySize);
    }
}
