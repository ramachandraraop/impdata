#include <stdio.h>
int main() {
    int xyz = 10;
    int* ptr;
    ptr = &xyz;
    printf("Value of xyz = %d\n", xyz);
    printf("Address of xyz : %u\n", &xyz);
    printf("Pointer ptr has : %u\n", ptr);
    printf("Value stored in ptr: %d\n", *ptr);
    return 0;
}
