#include <stdio.h>
#include <stdlib.h>

struct Node {
    int val;
    struct Node* next;
};

void printList(struct Node* head) {
    if (head) {
        struct Node* ref = head;
	printf("(");
	while (ref) {
	    printf("%d", ref->val);
	    if (ref->next) {
	        printf("->");
	    }
	    ref = ref->next;
	}
	printf(")\n");
    }
}

void removeAll(int val, struct Node* head) {
    if (head) {
	struct Node* prev = head;
        struct Node* ref = head->next;
	while (ref) {
	    if (ref->val == val) {
	        prev->next = ref->next;
		free(ref);
	    } else {
	        prev = ref;
	    }
	    ref = ref->next;
	}
    }
}

void removeDups(struct Node* head) {
    struct Node* ref = head;
    while (ref) {
        removeAll(ref->val, ref);
	ref = ref->next;
    }
    printList(head);
}

struct Node* makeNode(int val) {
    struct Node* node = malloc(sizeof(struct Node));
    node->val = val;
    node->next = NULL;
    return node;
}

int main(void) {
    struct Node* node1 = makeNode(1);
    struct Node* node2 = makeNode(2);
    struct Node* node3 = makeNode(3);
    struct Node* head = node1;
    node1->next = node2;
    node2->next = node3;
    printList(head);
    removeDups(head);
}
