package algorithms.twopointers;

import com.michalgosek.algorithms.twopointers.LinkedListCycle;
import com.michalgosek.datastructures.linkedlist.Node;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static algorithms.testhelpers.TestHelpers.buildLinkedListWithCycle;
import static algorithms.testhelpers.TestHelpers.buildLinkedListWithoutCycle;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinkedListCycleTest {


    static Stream<Arguments> linkedListCycleTestData() {
        return Stream.of(
                Arguments.of(buildLinkedListWithoutCycle(3), false),
                Arguments.of(buildLinkedListWithCycle(3), true)
        );
    }

    @ParameterizedTest
    @MethodSource("linkedListCycleTestData")
    public void shouldReturnIsCycleAnswerAccordingToTestData(Node<Integer> nodes, boolean expectedCycle) {
        // act:
        var hasCycle = LinkedListCycle.hasCycle(nodes);

        // assert:
        assertEquals(expectedCycle, hasCycle);
    }
}
