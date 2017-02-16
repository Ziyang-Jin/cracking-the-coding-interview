#include <stdio.h>
#include <stdlib.h>
#include "../linked_list.h"

struct Node* removeMiddle(struct Node* head, struct Node* n) {
    if (n != head) {
        struct Node* ref = head;
        struct Node* prev = ref;
	while (ref && ref != n) {
	    prev = ref;
	    ref = ref->next;
	}
	if (ref && ref->next) {
	    prev->next = ref->next;
	}
    }
    printList(head);
    return head;
}

int main(void) {
    struct Node* list = generateList(10);
    struct Node* three = list->next->next->next;
    printf("remove the third element:\n");
    removeMiddle(list, three);
    printf("remove head:\n");
    removeMiddle(list, list);
    printf("remove tail:\n");
    removeMiddle(list, getTail(list));
    free(three);
    destroyList(list);
}
