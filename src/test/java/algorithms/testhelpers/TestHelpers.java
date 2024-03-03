package algorithms.testhelpers;

import com.michalgosek.datastructures.linkedlist.Node;

public class TestHelpers {
    public static Node<Integer> buildLinkedListWithoutCycle(int N) {
        var head = new Node<>(0);
        var temp = head;
        for (var i = 1; i < N; i++) {
            temp.next = new Node<Integer>(i);
            temp = temp.next;
        }
        return head;
    }

    public static Node<Integer> buildLinkedListWithCycle(int N) {
        var head = new Node<>(0);
        var temp = head;
        for (var i = 1; i < N; i++) {
            temp.next = new Node<Integer>(i);
            temp = temp.next;
        }
        temp.next = head;
        return head;
    }
}
