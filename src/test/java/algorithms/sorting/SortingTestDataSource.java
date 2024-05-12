package algorithms.sorting;

import org.junit.jupiter.params.provider.Arguments;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class SortingTestDataSource {
    public static Stream<Arguments> DataSet() {
        return Stream.of(
                arguments(Arrays.asList(3, 4, 2, -1, 1, 0), Arrays.asList(-1, 0, 1, 2, 3, 4)),
                arguments(Arrays.asList(1, 0), Arrays.asList(0, 1))
        );
    }
}