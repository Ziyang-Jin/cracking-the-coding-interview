#include <stdio.h>
#include <stdlib.h>
#include "../linked_list.h"

struct Node* partition(struct Node* head, int val) {
    struct Node* leftHead = NULL;
    struct Node* rightHead = NULL;
    struct Node* left = leftHead;
    struct Node* right = rightHead;
    struct Node* ref = head;
    while (ref) {
        if (ref->val < val) {
	    if (leftHead == NULL) {
	        leftHead = ref;
		left = leftHead;
	    } else {
	        left->next = ref;
	        left = left->next;
	    }
	} else {
	    if (rightHead == NULL) {
	        rightHead = ref;
		right = rightHead;
	    } else {
	        right->next = ref;
	        right = right->next;
	    }
	}
	ref = ref->next;
    }
    if (leftHead) {
        left->next = rightHead;
    } else {
        leftHead = rightHead;
    }
    printList(leftHead);
    return leftHead;
}

int main(void) {
    struct Node* list1 = generateList(5);
    struct Node* list2 = generateList(5);
    struct Node* tailList1 = getTail(list1);
    tailList1->next = list2;
    printList(list1);
    printf("partition 0:\n");
    struct Node* result = partition(list1, 0);
    printf("partition 4:\n");
    result = partition(list1, 4);
    printf("partition 3:\n");
    result = partition(list1, 3);
    destroyList(result);
}
