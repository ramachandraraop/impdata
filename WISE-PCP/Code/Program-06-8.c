#include <stdio.h>
int main() {
    int i = 1;
    printf("1. choice 1\n");
    printf("2. choice 2\n");
    printf("3. choice 3\n\n");
    printf("select option between 1 and 3: ");
    scanf("%d", &i);
    printf("\n");
    switch(i) {
        case 1 : 
            printf("you selected first choice");
            printf("\n");
        case 2 : 
            printf("you selected second choice");
            printf("\n");
        case 3 : 
            printf("you selected third choice");
            printf("\n");
            break;
        default:
            printf("1 -- 3 please\n");
            break;
    }
}
