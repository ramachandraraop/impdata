#include <stdio.h>
int main() {
    int a;
    int b;
    char op;
    printf("Enter two numbers and + or *: ");
    scanf("%d %d %c", &a, &b, &op);
    if (op == '+') {
        printf("The sum is %d\n", a + b);
    } else if (op == '*') {
        printf("The product is %d\n", a * b);
    } else {
        printf("scanf trouble\n");
    }
    return 0;
}
