package problems;

import com.michalgosek.problems.FindAllAnagramsInAString;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class FindAllAnagramsInAStringTest {
    static Stream<Arguments> findAllAnagramsInAStringTestData() {
        return Stream.of(
                arguments("cbaebabacd", "abc", Arrays.asList(0, 6)),
                arguments("abab", "ab", Arrays.asList(0, 1, 2))
        );
    }

    @ParameterizedTest
    @MethodSource("findAllAnagramsInAStringTestData")
    public void shouldReturnStartingIndicesOfAnagramsAccordingToTestData(String original, String check, List<Integer> expectedIndices) {
        // act:
        var indices = FindAllAnagramsInAString.Solution(original, check);

        // assert:
        assertEquals(expectedIndices, indices);
    }
}
