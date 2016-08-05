#include <stdio.h>
#include <stdlib.h>
int main(int argc, char* argv[]) {
    if (argc != 4) {
        printf("Usage: %s Number operator Number\n", argv[0]);
        printf("Remember to quote * as it has special meaning\n");
        exit(0);
    }
    int a = atoi(argv[1]);
    int b = atoi(argv[3]);
    char op = argv[2][0];
    int result;

    if (op == '+')
        result = a + b;
    else if (op == '-')
        result = a - b;
    else if (op == '*')
        result = a * b;
    else if (op == '/')
        result = a / b;
    else { 
        printf("Invalid operator <%c>\n", op);
        exit(1);
    }
    printf("%d %c %d = %d\n", a, op, b, result);
    return 0;
}
