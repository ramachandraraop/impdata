#include <stdio.h>
#include <stdlib.h>
int main(int argc, char* argv[]) {
    if (argc != 3) {
        printf("Usage: %s Input-Filename Output-Filename\n", argv[0]);
        exit(0);
    }

    FILE* inp = fopen(argv[1], "r");
    FILE* out = fopen(argv[2], "w");

    int ch;
    while ((ch = fgetc(inp)) != EOF) {
        if (ch == '\n')
            continue;
        fputc(ch, out);
        if (ch == '.')
            fputc(' ', out);
    }
    fclose(inp);
    fclose(out);
    return 0;
}
