#include <stdio.h>
int main() {
    int a; 
    int b;
    int c;
    int opt;
    printf("Enter two numbers ");
    scanf("%d %d", &a, &b);
    printf("\n\n");
    printf("1. Addition\n");
    printf("2. Subtraction\n");
    printf("3. Multiplication\n");
    printf("4. Division\n");
    printf("Select option 1 to 4. ");
    scanf("%d", &opt);
    printf("\n\n");
    switch (opt) {
        case 1:
            c = a + b;
            printf("Result = %d\n", c);
            break;
        case 2:
            c = a - b;
            printf("Result = %d\n", c);
            break;
        case 3:
            c = a * b;
            printf("Result = %d\n", c);
            break;
        case 4:
            c = a / b; /* Integer Division */
            printf("Result = %d\n", c);              
            break;
        default: 
            printf("Selected wrong option \n");
            break;
    }
    return 0;
}
