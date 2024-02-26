package algorithms.binaryserach.problems;

import com.michalgosek.algorithms.binarysearch.problems.FindBoundary;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class FindBoundaryTest {
    static Stream<Arguments> findBoundaryTestData() {
        return Stream.of(
                arguments(Arrays.asList(false, false, true, true, true), 2),
                arguments(Arrays.asList(false, false, true, true, true), 2),
                arguments(List.of(true), 0),
                arguments(List.of(false), -1),
                arguments(List.of(false, false, false), -1),
                arguments(List.of(true, true, true, true, true), 0),
                arguments(List.of(false, true), 1),
                arguments(List.of(false, false, false, false, false, false, false, false, true), 8)
        );
    }

    @ParameterizedTest
    @MethodSource("findBoundaryTestData")
    public void shouldReturnIndexOfFirstTrueAccordingToTestDataExpectations(List<Boolean> array, int expectedIndex) {
        // act:
        var index = FindBoundary.Solution(array);

        // assert:
        assertEquals(expectedIndex, index);
    }
}