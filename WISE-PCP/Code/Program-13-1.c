#include <stdio.h>
#include <stdlib.h>
int main(int argc, char* argv[]) {
    if (argc != 2) {
        printf("Usage: %s Filename\n", argv[0]);
        exit(0);
    }

    FILE* inp = fopen(argv[1], "r");
    int charCount = 0;
    int ch;

    const int BREAK = 25;
    while ((ch = fgetc(inp)) != EOF) {
        putchar(ch);
        if (ch == '\n')
            charCount = 0;
        else {
            charCount++;
            if (charCount > BREAK) {
                puts("-|-");
                charCount = 0;
            }
        }
    }
    fclose(inp);
    return 0;
}
