package problems;

import com.michalgosek.problems.FindTargetIndicesAfterSortingArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class FindTargetIndicesAfterSortingArrayTest {
    private static Stream<Arguments> findTargetIndicesAfterSortingArrayTestData() {
        return Stream.of(
                arguments(new int[]{1, 2, 5, 2, 3}, 2, Arrays.asList(1, 2)),
                arguments(new int[]{1, 2, 5, 2, 3}, 3, List.of(3)),
                arguments(new int[]{1, 2, 5, 2, 3}, 5, List.of(4)),
                arguments(new int[]{1, 2, 5, 2, 3, 3, 3, 3, 3, 3, 3, 3}, 3, Arrays.asList(3, 4, 5, 6, 7, 8, 9, 10)),
                arguments(new int[]{1, 2, 5, 2, 3, 3, 3, 3, 3, 3, 3, 3}, 14, List.of())
        );
    }

    @ParameterizedTest
    @MethodSource("findTargetIndicesAfterSortingArrayTestData")
    public void shouldReturnIndexValuesAccordingToTestData(int[] array, int target, List<Integer> expectedIndices) {
        // when:
        var indices = FindTargetIndicesAfterSortingArray.targetIndices(array, target);

        // then:
        assertEquals(expectedIndices, indices);
    }
}