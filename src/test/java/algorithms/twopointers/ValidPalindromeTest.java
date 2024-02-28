package algorithms.twopointers;

import com.michalgosek.algorithms.twopointers.ValidPalindrome;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidPalindromeTest {
    static Stream<Arguments> validPalindromeTestData() {
        return Stream.of(
                Arguments.arguments("Do geese see God?", true),
                Arguments.arguments("Was it a car or a cat I saw?", true),
                Arguments.arguments("A brown fox jumping over", false),
                Arguments.arguments("Oklahoma", false),
                Arguments.arguments("Oko", true)

        );
    }

    @MethodSource("validPalindromeTestData")
    @ParameterizedTest
    public void shouldReturnIsPalindromeBooleanValueAccordingToTestData(String text, boolean expectedResult) {
        // act:
        var isPalindrome = ValidPalindrome.isPalindrome(text);

        // assert:
        assertEquals(expectedResult, isPalindrome);
    }
}
