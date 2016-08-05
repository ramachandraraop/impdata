#include <stdio.h>
int main() {
    int num1, num2;
    int sum, sub, mult, div, mod;
    printf("Enter First Number :");
    scanf("%d", &num1);
    printf("Enter Second Number :");
    scanf("%d", &num2);
    sum = num1 + num2;
    printf("Sum  is: %d\n", sum);
    sub = num1 - num2;
    printf("Difference is : %d\n", sub);
    mult = num1 * num2;
    printf("Product is: %d\n", mult);
    div = num1 / num2;
    printf("Quotient is: %d\n", div);
    mod = num1 % num2;
    printf("Remainder is: %d\n", mod);
    return 0;
}
