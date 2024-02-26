package problems;

import com.michalgosek.problems.LengthOfLongestSubstring;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class LengthOfLongestSubstringTest {
    static Stream<Arguments> fixedLengthOfLongestSubstringTest() {
        return Stream.of(
                arguments("abcabcbb", 3),
                arguments("bbbbb", 1),
                arguments("pwwkew", 3),
                arguments("abcdaghjklmnosurtyxuwax", 18),
                arguments("", 0)
        );
    }

    @ParameterizedTest
    @MethodSource("fixedLengthOfLongestSubstringTest")
    public void shouldReturnIndexAccordingToTestData(String text, int expectedLongestSubstring) {
        // act:
        var lengthOfLongestSubstring = LengthOfLongestSubstring.Solution(text);

        // assert:
        assertEquals(expectedLongestSubstring, lengthOfLongestSubstring);
    }
}
