package algorithms.binaryserach.problems;

import com.michalgosek.algorithms.binarysearch.problems.PeakOfMountainArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class PeakOfMountainArrayTest {
    static Stream<Arguments> peakOfMountainArrayTestData() {
        return Stream.of(
                arguments(List.of(0, 1, 2, 3, 2, 1, 0), 3),
                arguments(List.of(0, 10, 3, 2, 1, 0), 1),
                arguments(List.of(0, 10, 0), 1),
                arguments(List.of(0, 1, 2, 12, 22, 32, 42, 52, 62, 72, 82, 92, 102, 112, 122, 132, 133, 132, 111, 0), 16)
        );
    }

    @ParameterizedTest
    @MethodSource("peakOfMountainArrayTestData")
    public void shouldReturnIndexOfPeakTargetAccordingToTestDataExpectations(List<Integer> array, int expectedPeak) {
        // when:
        var peak = PeakOfMountainArray.Solution(array);

        // act:
        assertEquals(expectedPeak, peak);
    }
}