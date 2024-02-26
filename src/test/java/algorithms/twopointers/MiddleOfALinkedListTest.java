package algorithms.twopointers;

import com.michalgosek.algorithms.twopointers.MiddleOfALinkedList;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.michalgosek.algorithms.twopointers.MiddleOfALinkedList.Node;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MiddleOfALinkedListTest {
    static Stream<Arguments> middleOfALinkedListTestData() {
        return Stream.of(
                Arguments.arguments(buildLinkedListWithNElements(5), 2),
                Arguments.arguments(buildLinkedListWithNElements(6), 3)
        );
    }

    static MiddleOfALinkedList.Node<Integer> buildLinkedListWithNElements(int N) {
        var head = new Node(0);
        var temp = head;
        for (var i = 1; i < N; i++) {
            temp.next = new Node(i);
            temp = temp.next;
        }
        return head;
    }

    @ParameterizedTest
    @MethodSource("middleOfALinkedListTestData")
    public void shouldReturnMiddleValueOfLinkedListAccordingToTestData(MiddleOfALinkedList.Node<Integer> linkedList, int expectedMiddleNodeValue) {
        // act:
        var middleNodeValue = MiddleOfALinkedList.Solution(linkedList);

        // assert:
        assertEquals(expectedMiddleNodeValue, middleNodeValue);
    }
}
