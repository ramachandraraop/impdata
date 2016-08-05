#include <stdio.h>
int main() {
    int i = 10;
    do {
        printf("%4d", i);
        i--;
    } while (i > 0);
    printf("\n");
    return 0;
}
