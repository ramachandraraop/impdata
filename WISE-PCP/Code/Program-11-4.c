#include <stdio.h>
int main() {
    char name[20];
    char tmp[20];
    puts("Enter your name ");
    fgets(name, 20, stdin);
    printf("Hello <%s>\n", name);
    return 0;
}

