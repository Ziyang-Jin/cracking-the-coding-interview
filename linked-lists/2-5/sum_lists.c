#include <stdio.h>
#include <stdlib.h>
#include "../linked_list.h"

int getNumber(struct Node* list) {
    int result = 0;
    while (list) {
        result = result * 10 + list->val;
	list = list->next;
    }
    return result;
}

int sumLists(struct Node* list1, struct Node* list2) {
    return getNumber(list1) + getNumber(list2);
}

int getNumberBackward(struct Node* list) {
    int times = 1;
    int result = 0;
    while (list) {
        result += list->val * times;
	times *= 10;
	list = list->next;
    }
    return result;
}

int sumListsBackward(struct Node* list1, struct Node* list2) {
    return getNumberBackward(list1) + getNumberBackward(list2);
}

int main(void) {
    struct Node* list1 = generateList(3);
    struct Node* list2 = generateList(2);
    int sum = sumLists(list1, list2);
    printf("forward: list1 + list2 = %d\n", sum);
    sum = sumListsBackward(list1, list2);
    printf("backward: list1 + list2 = %d\n", sum);
    destroyList(list1);
    destroyList(list2);
}
