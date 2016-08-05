#include <stdio.h>
int main() {
    int num;
    printf("Enter The value : ");
    scanf("%d", &num);
    if (!(num >= 0))
        printf("%d is an Negative Number \n", num);
    else
        printf("%d is an Positive Number \n", num);
    return 0;
}
