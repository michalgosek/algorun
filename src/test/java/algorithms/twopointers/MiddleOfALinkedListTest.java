package algorithms.twopointers;

import com.michalgosek.algorithms.twopointers.MiddleOfALinkedList;
import com.michalgosek.datastructures.linkedlist.Node;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static algorithms.testhelpers.TestHelpers.buildLinkedListWithoutCycle;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MiddleOfALinkedListTest {
    static Stream<Arguments> middleOfALinkedListTestData() {
        return Stream.of(
                Arguments.arguments(buildLinkedListWithoutCycle(5), 2),
                Arguments.arguments(buildLinkedListWithoutCycle(6), 3)
        );
    }

    @ParameterizedTest
    @MethodSource("middleOfALinkedListTestData")
    public void shouldReturnMiddleValueOfLinkedListAccordingToTestData(Node<Integer> linkedList, int expectedMiddleNodeValue) {
        // act:
        var middleNodeValue = MiddleOfALinkedList.Solution(linkedList);

        // assert:
        assertEquals(expectedMiddleNodeValue, middleNodeValue);
    }
}
