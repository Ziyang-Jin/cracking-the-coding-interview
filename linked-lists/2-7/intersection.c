#include <stdio.h>
#include <stdlib.h>
#include "../linked_list.h"

int contains(struct Node** ptrs, int n, struct Node* node) {
    for (int i = 0; i < n; i++) {
        if (ptrs[i] == node) {
	    return 1;
	}
    }
    return 0;
}

struct Node* intersect(struct Node* list1, struct Node* list2) {
    int n1 = getSize(list1);
    struct Node* ptrs[n1];
    for (int i = 0; i < n1; i++) {
        ptrs[i] = list1;
	list1 = list1->next;
    }
    while (list2) {
        if (contains(ptrs, n1, list2)) {
	    return list2;
	}
	list2 = list2->next;
    }
    return NULL;
}

int main(void) {
    struct Node* list1 = generateList(5);
    struct Node* list2 = list1->next->next->next;
    printList(list2);
    struct Node* common = intersect(list1, list2);
    printList(common);
    destroyList(list1);
}
