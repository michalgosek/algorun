package algorithms.twopointers;

import com.michalgosek.problems.FindAllAnagramsInAString;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindAllAnagramsInAStringTest {
    static Stream<Arguments> findAllAnagramsInAStringTestData() {
        return Stream.of(
                Arguments.arguments("cbaebabacd", "abc", Arrays.asList(0, 6)),
                Arguments.arguments("abab", "ab", Arrays.asList(0, 1, 2)),
                Arguments.arguments("nabanabannaabbaanana", "banana", Arrays.asList(0, 3, 5, 6, 7, 13)),
                Arguments.arguments("wubudubuwubuthattrue", "ubutu", List.of()),
                Arguments.arguments("act", "cact", List.of()),
                Arguments.arguments("thequickbrownfoxjumpsoverthelazydog", "thelazydogjumpsoverthequickbrownfox", List.of(0))
        );
    }

    @MethodSource("findAllAnagramsInAStringTestData")
    @ParameterizedTest
    public void shouldMovesZeroFromNumbersArrayToTheEndAccordingToTestData(String original, String check, List<Integer> expectedIndices) {
        // act:
        var anagramIndices = FindAllAnagramsInAString.Solution(original, check);

        // assert:
        assertEquals(expectedIndices, anagramIndices);
    }
}
