#include <stdio.h>
int main() {
    int num;
    printf("\n Enter Number :");
    scanf("%d", &num);
    if (num >= 0) {
        printf("%d is an Positive Number \n", num);
        if (num % 2 == 0)
            printf("%d is an Even Number \n", num);
        else
            printf("%d is an Odd Number \n", num);
    } else { 
        printf("%d is an Negative Number \n", num);
    }
    return 0;
}
