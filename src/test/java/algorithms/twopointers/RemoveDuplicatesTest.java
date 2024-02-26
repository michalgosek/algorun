package algorithms.twopointers;

import com.michalgosek.algorithms.twopointers.RemoveDuplicates;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveDuplicatesTest {
    static Stream<Arguments> removeDuplicatesTestData() {
        return Stream.of(
                Arguments.arguments(Arrays.asList(0, 0, 1, 1, 1, 2, 2), 3),
                Arguments.arguments(Arrays.asList(1, 2, 3, 4, 5), 5),
                Arguments.arguments(Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1), 1),
                Arguments.arguments(Arrays.asList(1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6), 6)
        );
    }

    @ParameterizedTest
    @MethodSource("removeDuplicatesTestData")
    public void shouldReturnNewArrayLengthAccordingToTestData(List<Integer> numbers, int expectedArrayLength) {
        // act:
        var arrayLength = RemoveDuplicates.Solution(numbers);

        // assert:
        assertEquals(expectedArrayLength, arrayLength);
    }
}
