#include <stdio.h>
#include <string.h>
char* getString(char* string, int size);

int main() {
    char s[21];
    char t[21];
    char st[41];

    puts("Enter the first string");
    getString(s, 20);
    puts("Enter the second string");
    getString(t, 20);

    printf("Length of first is %d and second is %d\n",
            strlen(s), strlen(t));
  
    puts("Copying first to third");
    strcpy(st, s);
    puts("So third is now:");
    puts(st);
    puts("Appending second to third");
    strcat(st, t);
    puts("So third is now:");
    puts(st);

    int compare = strcmp(s, t);
    if (compare == 0) {
        puts("First and second are same");
    } else if (compare < 0) {
        printf("%s < %s\n", s, t);
    } else {
        printf("%s > %s\n", s, t);
    }
    return 0;
}

char* getString(char* s, int n) {
    fgets(s, n, stdin);
    int linefeedPosition = strlen(s) - 1;
    s[linefeedPosition] = '\0';
    return s;
}
