#include <stdio.h>
int main() {
    int num;
    printf("Enter The Number: ");
    scanf("%d", &num);
    for (int i = 1; i <= 10; i++) {
        printf ("%2d * %2d = %3d\n", num, i , (num * i));
    }
    return 0;
}
