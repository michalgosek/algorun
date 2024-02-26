package problems;

import com.michalgosek.problems.CountPairsWhoseSumIsLessThanTarget;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CountPairsWhoseSumIsLessThanTargetTest {
    private static Stream<Arguments> countPairsWhoseSumIsLessThanTargetTestData() {
        return Stream.of(
                arguments(Arrays.asList(-1, 1, 2, 3, 1), 2, 3),
                arguments(Arrays.asList(-6, 2, 5, -2, -7, -1, 3), -2, 10));
    }

    @ParameterizedTest
    @MethodSource("countPairsWhoseSumIsLessThanTargetTestData")
    public void shouldReturnPairsNumberAccordingToTestData(List<Integer> numbers, int target, int expectedPairs) {
        // act:
        var pairs = CountPairsWhoseSumIsLessThanTarget.Solution2(numbers, target);

        // assert:
        assertEquals(expectedPairs, pairs);
    }
}
