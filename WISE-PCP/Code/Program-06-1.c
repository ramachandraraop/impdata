#include <stdio.h>
int main() {
    int num;
    printf("Type in an integer value ");
    scanf("%d", &num);
    if (num == 0) {
        printf("The number was zero\n");
    }
    if (num > 0) {
        printf("The number was positive\n");
    }
    if (num < 0) {
        printf("The number was negative\n");
    }
    return 0;
}
