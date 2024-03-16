package algorithms.twopointers;

import com.michalgosek.algorithms.twopointers.LeastConsecutiveCardsToMatch;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class LeastConsecutiveCardsToMatchTest {
    static Stream<Arguments> leastConsecutiveCardsToMatchTestData() {
        return Stream.of(
                arguments(Arrays.asList(3, 4, 2, 3, 4, 7), 4),
                arguments(Arrays.asList(8, 0, 5, 10), -1),
                arguments(Arrays.asList(8, 0, 5, 10, 10), 2),
                arguments(Arrays.asList(8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8), 2),
                arguments(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), -1)
        );
    }

    @ParameterizedTest
    @MethodSource("leastConsecutiveCardsToMatchTestData")
    public void shouldReturnShortestSubarraySizeAccordingToTestData(List<Integer> numbers, int expectedDeckSizeWithPair) {
        // act:
        var consecutiveCardsToMatch = LeastConsecutiveCardsToMatch.Solution(numbers);

        // arrange:
        assertEquals(expectedDeckSizeWithPair, consecutiveCardsToMatch);
    }
}
