#include <stdio.h>
int main() {
    char name[20];
    char tmp[20];
    puts("Enter your name ");
    scanf("%s%s", name, tmp);
    printf("Hello %s\n", name);
    printf("What is this %s\n", tmp);
    return 0;
}

