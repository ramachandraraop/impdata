#include <stdio.h>
int main() {
    char msg[] = "Hello";
    int  fib[] = { 1, 1, 2, 3, 5, 8};

    for (char* p = msg; *p != '\0'; p++) {
        printf("Address in p is %u and it contains %c\n", p, *p);
    }
    printf("\n");
    int* p = fib;
    for (int i = 0; i < 6; i++, p++) {
        printf("Address in p is %u and it contains %d\n", p, *p);
    }
    return 0;
}
