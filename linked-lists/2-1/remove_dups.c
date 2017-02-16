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

void removeAllSkipHead(int val, struct Node* head) {
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
        removeAllSkipHead(ref->val, ref);
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

struct Node* makeTestList() {
    struct Node* node0 = makeNode(1);
    struct Node* node1 = makeNode(1);
    struct Node* node2 = makeNode(2);
    struct Node* node3 = makeNode(3);
    struct Node* node4 = makeNode(3);
    struct Node* node5 = makeNode(2);
    struct Node* head = node0;
    node0->next = node1;
    node1->next = node2;
    node2->next = node3;
    node3->next = node4;
    node4->next = node5;
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

int main(void) {
    struct Node* list = makeTestList();
    removeDups(list);
    destroyList(list);
}
