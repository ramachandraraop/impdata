#include <stdio.h>
int main() {
    int limit;
    printf("Enter the size : ");
    scanf("%d", &limit);
    for (int i = 1; i <= limit; i++) {
        for (int k = i; k <= limit; k++)  
            printf(" ");
        for (int j = 1; j <= i; j++) {
            printf("* ");
        }
        printf("\n");
    }
    return 0;
}
