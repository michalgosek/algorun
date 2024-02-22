package algorithms.binaryserach;

import com.michalgosek.algorithms.binarysearch.BinarySearch;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class BinarySearchTest {
    static Stream<Arguments> binarySearchTestData() {
        return Stream.of(
                arguments(Arrays.asList(1, 3, 5, 7, 8), 5, 2),
                arguments(Arrays.asList(1, 2, 3, 4, 5, 6, 7), 0, -1),
                arguments(Arrays.asList(2, 8, 89, 120, 1000), 120, 3),
                arguments(Arrays.asList(10, 20), 20, 1),
                arguments(Arrays.asList(1, 2, 3, 4, 5), 20, -1),
                arguments(List.of(1), 1, 0),
                arguments(List.of(), 1, -1)
        );
    }

    @ParameterizedTest
    @MethodSource("binarySearchTestData")
    public void shouldReturnIndexAccordingToTestData(List<Integer> array, int target, int expectedIndex) {
        // when:
        var index = BinarySearch.Search(array, target);

        // then:
        assertEquals(expectedIndex, index);
    }
}