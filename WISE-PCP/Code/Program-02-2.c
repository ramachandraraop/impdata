#include <stdio.h>
int main() {
    char lett = 'w';
    int i = 1;
    int j = 29;
    printf("<%c>\n", lett);
    printf("<%4c>\n", lett);
    printf("<%-3c>\n\n", lett);
    printf("<%d>\n", i);
    printf("<%d>\n", j);
    printf("<%10d>\n", j);
    printf("<%010d>\n", j);
    printf("<%-010d>\n", j);
    printf("<%20x>\n", j);
    printf("<%2x>\n", j);
}
