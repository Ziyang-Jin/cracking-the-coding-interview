#include <stdio.h>
#include <stdlib.h>
#include "../linked_list.h"

int isPalindrome(struct Node* list) {
    int n = getSize(list);
    struct Node* ptrs[n];
    for (int i = 0; i < n; i++) {
        ptrs[i] = list;
	list = list->next;
    }
    for (int i = 0; i < n/2; i++) {
        if (ptrs[i]->val != ptrs[n-i-1]->val) {
	    return 0;
	} 
    }
    return 1;
}

struct Node* makeTestList() {
    struct Node* head = makeNode(5);
    struct Node* node1 = makeNode(2);
    struct Node* node2 = makeNode(5);
    head->next = node1;
    node1->next = node2;
    printList(head);
    return head;
}

void judge(int result) {
    if (result) {
        printf("test passed!\n");
    } else {
        printf("test failed!\n");
    }
}

int main(void) {
    struct Node* list1 = makeTestList();
    int result = isPalindrome(list1);
    judge(result);
    struct Node* list2 = generateList(5);
    result = isPalindrome(list2);
    judge(!result);
    destroyList(list1);
    destroyList(list2);
}

