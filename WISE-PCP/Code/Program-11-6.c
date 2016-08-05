#include <stdio.h>
int main() {
    char* langs[] = {"Pascal", "C", "C++", "Java"};
    char* p; 
    for (int i = 0; i < 4; i++) {
        p = langs[i];
        printf("%10s is at %u\n", langs[i], p);
    }
    puts("-------------------");
    char** q = langs;
    for (int i = 0; i < 4; i++) {
        printf("%10s is at %u\n", langs[i], *q++);
    }
    return 0;
}
