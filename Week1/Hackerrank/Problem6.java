static SinglyLinkedListNode removeNodes(SinglyLinkedListNode listHead, int x) {
    SinglyLinkedListNode newHead = listHead;
    SinglyLinkedListNode current = listHead;
    SinglyLinkedListNode prev = null;

    while (current != null) {

        if (current.data > x) {

            if (prev == null) {
                newHead = current.next;
            } else {
                prev.next = current.next;
            }

        } else {
            prev = current;
        }

        current = current.next;
    }

    return newHead;
}
