#include <stdio.h>

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

struct Node* makeNode(int val) {
    struct Node* node = malloc(sizeof(struct Node));
    node->val = val;
    node->next = NULL;
    return node;
}

struct Node* generateList(int n) {
    struct Node* head = makeNode(0);
    struct Node* ref = head;
    for (int i = 1; i < n; i++) {
	ref->next = makeNode(i);
	ref = ref->next;
    }
    printList(head);
    return head;
}

void destroyList(struct Node* head) {
    struct Node* ref = head;
    while (head) {
        head = head->next;
	free(ref);
	ref = head;
    }
}

struct Node* getTail(struct Node* head) {
    struct Node* ref = head;
    while (ref && ref->next) {
        ref = ref->next;
    }
    return ref;
}
