package algorithms.twopointers;

import com.michalgosek.algorithms.twopointers.MoveZeros;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoveZerosTest {
    static Stream<Arguments> moveZerosTestData() {
        return Stream.of(
                Arguments.arguments(Arrays.asList(1, 0, 2, 0, 0, 7), Arrays.asList(1, 2, 7, 0, 0, 0)),
                Arguments.arguments(Arrays.asList(3, 1, 0, 1, 3, 8, 9), Arrays.asList(3, 1, 1, 3, 8, 9, 0)),
                Arguments.arguments(Arrays.asList(0, 0, 9, 4, 0, 0, 3, 8, 0), Arrays.asList(9, 4, 3, 8, 0, 0, 0, 0, 0))
        );
    }

    @MethodSource("moveZerosTestData")
    @ParameterizedTest
    public void shouldMovesZeroFromNumbersArrayToTheEndAccordingToTestData(List<Integer> numbers, List<Integer> expectedNumbers) {
        // act:
        MoveZeros.Solution(numbers);

        // assert:
        assertEquals(expectedNumbers, numbers);
    }
}
