#include <stdio.h>
#include <stdlib.h>
#include <string.h>
int main(int argc, char* argv[]) {
    if (argc != 3) {
        printf("Usage: %s Input-File Output-File\n", argv[0]);
        exit(0);
    }

    FILE* inp = fopen(argv[1], "r");
    FILE* out = fopen(argv[2], "w");

    char line[1024];
    char buffer[1024];

    int lineNum = 0;
    while (fgets(buffer, 1024, inp) != NULL) {
        sprintf(line, "%4d: ", ++lineNum);
        strcat(line, buffer);
        fputs(line, out);
    }    

    fclose(inp);
    fclose(out);
    return 0;
}
