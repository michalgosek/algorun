package algorithms.twopointers;

import com.michalgosek.algorithms.twopointers.LongestSubstringWithoutRepeatingCharacters;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestSubstringWithoutRepeatingCharactersTest {
    static Stream<Arguments> longestSubstringWithoutRepeatingCharactersTestData() {
        return Stream.of(
                Arguments.arguments("abcdefgh", 8),
                Arguments.arguments("abcc", 3),
                Arguments.arguments("abcdbea", 5),
                Arguments.arguments("aba", 2),
                Arguments.arguments("abccabcabcc", 3),
                Arguments.arguments("aaaabaaa", 2)
        );
    }

    @ParameterizedTest
    @MethodSource("longestSubstringWithoutRepeatingCharactersTestData")
    public void shouldReturnLongestSubstringWithoutRepeatingCharactersAccordingToTestData(String text, int expectedLongestSubstringLength) {
        // act:
        var longestSubstringWithoutDuplicates = LongestSubstringWithoutRepeatingCharacters.Solution(text);

        // assert:
        assertEquals(expectedLongestSubstringLength, longestSubstringWithoutDuplicates);
    }
}
