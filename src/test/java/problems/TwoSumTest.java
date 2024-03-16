package problems;

import com.michalgosek.problems.TwoSum;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class TwoSumTest {
    static Stream<Arguments> twoSumTestData() {
        return Stream.of(
                arguments(new int[]{1, 3, 5, 7, 8}, 12, new int[]{2, 3}),
                arguments(new int[]{1, 2, 3, -1, 5, 6, 7}, 10, new int[]{2, 6}),
                arguments(new int[]{2, 8, 89, 120, 1000}, 1120, new int[]{3, 4}),
                arguments(new int[]{2, 7, 11, 15}, 9, new int[]{0, 1}),
                arguments(new int[]{3, 2, 4}, 6, new int[]{1, 2}),
                arguments(new int[]{3, 3}, 6, new int[]{0, 1})
        );
    }

    @ParameterizedTest
    @MethodSource("twoSumTestData")
    public void shouldReturnIndicesAccordingToTestData(int[] numbers, int target, int[] expectedIndices) {
        // act:
        var indices = TwoSum.Solution(numbers, target);

        // assert:
        assertArrayEquals(expectedIndices, indices);
    }
}
