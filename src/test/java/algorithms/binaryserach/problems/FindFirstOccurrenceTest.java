package algorithms.binaryserach.problems;

import com.michalgosek.algorithms.binarysearch.problems.FindFirstOccurrence;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class FindFirstOccurrenceTest {

    static Stream<Arguments> findFirstOccurrenceTestData() {
        return Stream.of(
                arguments(Arrays.asList(1, 22, 22, 33, 50, 100, 20000), 33, 3),
                arguments(Arrays.asList(1, 3, 3, 3, 3, 6, 10, 10, 10, 100), 3, 1),
                arguments(Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1), 1, 0),
                arguments(Arrays.asList(4, 6, 7, 7, 7, 20), 8, -1),
                arguments(Arrays.asList(6, 7, 9, 10, 10, 10, 90), 10, 3),
                arguments(List.of(4), 4, 0),
                arguments(Arrays.asList(2, 3, 5, 7, 11), 2, 0),
                arguments(Arrays.asList(1, 3, 5, 8, 13, 21), 40, -1)
        );
    }

    @ParameterizedTest
    @MethodSource("findFirstOccurrenceTestData")
    public void shouldReturnIndexOfFirstTargetOccurrenceAccordingToTestDataExpectations(List<Integer> array, int target, int expectedIndex) {
        // act:
        var index = FindFirstOccurrence.Solution(array, target);

        // act:
        assertEquals(expectedIndex, index);
    }
}