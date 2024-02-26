package algorithms.binaryserach.problems;

import com.michalgosek.algorithms.binarysearch.problems.FirstNotSmaller;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class FirstNotSmallerTest {
    static Stream<Arguments> firstNotSmallerTestData() {
        return Stream.of(
                arguments(Arrays.asList(1, 3, 3, 5, 8, 8, 10), 2, 1),
                arguments(List.of(0), 0, 0),
                arguments(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 10, 9),
                arguments(List.of(1, 2, 2, 2, 2, 2, 2, 3, 5, 8, 8, 10), 2, 1),
                arguments(List.of(1, 3, 3, 3, 3, 3), 3, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("firstNotSmallerTestData")
    public void shouldReturnIndexOfFirstLessValueThanTargetAccordingToTestDataExpectations(List<Integer> array, int target, int expectedIndex) {
        // act:
        var index = FirstNotSmaller.Solution(array, target);

        // act:
        assertEquals(expectedIndex, index);
    }
}
