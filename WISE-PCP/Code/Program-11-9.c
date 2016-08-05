#include <stdio.h>
#include <stdlib.h>
int main() {
    int n;
    printf("Enter number of elements: ");
    scanf("%d", &n);
    int* ptr = (int*) malloc(n * sizeof(int));  
    if (ptr == NULL) {
        printf("Error! memory not allocated.");
        exit(0);
    }
    printf("Enter elements of array: ");
    for (int i = 0; i < n; ++i) {
        scanf("%d",ptr+i);
    }
    int total = 0;
    for (int i = 0; i < n; ++i) {
        total += *(ptr + i);
    }
    printf("Sum = %d\n", total);
    free(ptr);
    return 0;
}
