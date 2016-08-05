#include <stdio.h>
int main() {
    int a;
    int b;
    char op;
    printf("Enter two numbers: ");
    scanf("%d %d", &a, &b);
    printf("Enter + or *");
    scanf("%c", &op);
    if (op == '+') {
        printf("The sum is %d\n", a + b);
    } else if (op == '*') {
        printf("The product is %d\n", a * b);
    } else {
        printf("scanf trouble\n");
    }
    return 0;
}
