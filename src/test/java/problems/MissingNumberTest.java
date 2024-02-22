package problems;

import com.michalgosek.problems.MissingNumber;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MissingNumberTest {
    private static Stream<Arguments> missingNumberTestData() {
        return Stream.of(
                arguments(new int[]{3, 0, 1}, 2),
                arguments(new int[]{0, 1}, 2),
                arguments(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}, 8)
        );
    }

    @ParameterizedTest
    @MethodSource("missingNumberTestData")
    public void shouldReturnMissingNumberAccordingToTestData(int[] array, int expectedNumber) {
        // when:
        var number = MissingNumber.missingNumber(array);

        // then:
        assertEquals(expectedNumber, number);
    }
}