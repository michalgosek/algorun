package problems;

import com.michalgosek.algorithms.twopointers.MinimumWindowSubstring;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MinimumWindowSubstringTest {
    static Stream<Arguments> minimumWindowSubstringTestData() {
        return Stream.of(
                arguments("ADOBECODEBANC", "ABC", "BANC"),
                arguments("a", "a", "a"),
                arguments("a", "aa", "")

        );
    }

    @ParameterizedTest
    @MethodSource("minimumWindowSubstringTestData")
    public void shouldReturnMinimumSubstringAccordingToTestData(String original, String check, String expectedSubstring) {
        // act:
        var minimumSubstring = MinimumWindowSubstring.Solution(original, check);

        // assert:
        assertEquals(expectedSubstring, minimumSubstring);
    }
}
