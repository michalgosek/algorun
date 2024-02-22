package algorithms.binaryserach.problems;

import com.michalgosek.algorithms.binarysearch.problems.Newspapers;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class NewspapersTest {
    static Stream<Arguments> newspapersTestData() {
        return Stream.of(
                arguments(Arrays.asList(5, 10, 15, 20), 2, 30),
                arguments(Arrays.asList(5, 10, 30), 2, 30),
                arguments(Arrays.asList(5, 5, 5, 5), 2, 10),
                arguments(Arrays.asList(1, 1, 1, 1, 1, 1), 6, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("newspapersTestData")
    public void shouldReturnLongestReadTimeAccordingToTestDataExpectations(List<Integer> newspapersReadTimes, int numCoworkers, int expectedTime) {
        // when:
        var time = Newspapers.Solution(newspapersReadTimes, numCoworkers);

        // act:
        assertEquals(expectedTime, time);
    }
}
