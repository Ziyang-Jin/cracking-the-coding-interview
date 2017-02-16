#include <stdio.h>
#include <stdlib.h>
#include "linked_list.h"

struct Node* kthToLast(struct Node* head, int k) {
    // assume k >= 0
    struct Node* ref = head;
    while (k > 0) {
        if (ref) {
	    ref = ref->next;
	    k--;
	} else {
	    break;
	}
    }
    printList(ref);
    return ref;
}

int main(void) {
    struct Node* list = generateList(10);
    struct Node* sinceZero = kthToLast(list, 0);
    struct Node* sinceThree = kthToLast(list, 3);
    struct Node* sinceSix = kthToLast(list, 6);
    struct Node* sinceNine = kthToLast(list, 9);
    struct Node* sinceTen = kthToLast(list, 10);
    destroyList(list);
}
