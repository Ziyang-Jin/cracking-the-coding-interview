#include <stdio.h>
#include <stdlib.h>
#include "../linked_list.h"

#define MAX_SIZE 1024

int contains(struct Node** ptrs, int size, struct Node* node) {
    for (int i = 0; i < size; i++) {
        if (ptrs[i] == node) {
	    return 1;
	}
    }
    return 0;
}

void freeList(struct Node* list) {
    struct Node* ptrs[MAX_SIZE];
    int size = 0;
    while (list) {
        if (!contains(ptrs, size, list)) {
	    ptrs[size++] = list;
	    list = list->next;
	} else {
	    break;
	}
    }
    for (int i = 0; i < size; i++) {
        free(ptrs[i]);
    }
}

struct Node* loopNode(struct Node* list) {
    struct Node* ptrs[MAX_SIZE];
    int size = 0;
    while (list) {
        if (!contains(ptrs, size, list)) {
            ptrs[size++] = list;
	    list = list->next;
	} else {
	    break;
	}
    }
    return list;
}

struct Node* makeTestList() {
    struct Node* head = makeNode(1);
    struct Node* node1 = makeNode(2);
    struct Node* node2 = makeNode(3);
    struct Node* node3 = makeNode(4);
    head->next = node1;
    node1->next = node2;
    node2->next = node3;
    node3->next = node1;
    return head;
}

int main(void) {
    struct Node* list = makeTestList();
    struct Node* result = loopNode(list);
    if (list->next == result) {
        printf("test passed!\n");
    }
    freeList(list);
}
