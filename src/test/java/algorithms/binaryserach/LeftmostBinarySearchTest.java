package algorithms.binaryserach;

import com.michalgosek.algorithms.binarysearch.LeftmostBinarySearch;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class LeftmostBinarySearchTest {
    static Stream<Arguments> leftmostBinarySearchTestData() {
        return Stream.of(
                arguments(Arrays.asList(1, 3, 5, 7, 8), 5, 2),
                arguments(Arrays.asList(1, 2, 3, 4, 5, 6, 7), 0, 0),
                arguments(Arrays.asList(2, 8, 89, 120, 1000), 120, 3),
                arguments(Arrays.asList(10, 20), 20, 1),
                arguments(Arrays.asList(1, 2, 3, 4, 5), 20, 5),
                arguments(Arrays.asList(1, 2, 3, 3, 3, 6, 9), 7, 6),
                arguments(Arrays.asList(1, 2, 3, 3, 3, 6, 9), -5, 0),
                arguments(Arrays.asList(1, 2, 3, 3, 3, 6, 9), 10, 7)
        );
    }

    @ParameterizedTest
    @MethodSource("leftmostBinarySearchTestData")
    public void shouldReturnIndexAccordingToTestData(List<Integer> array, int target, int expectedIndex) {
        // when:
        var index = LeftmostBinarySearch.Search(array, target);

        // then:
        assertEquals(expectedIndex, index);
    }
}
