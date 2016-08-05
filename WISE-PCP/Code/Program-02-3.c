#include <stdio.h>
int main() {
    float x = 333.123456;
    double y = 333.1234567890123456;
    printf("<%f>\n", x);
    printf("<%.1f>\n", x);
    printf("<%20.3f>\n", x);
    printf("<%-20.3f>\n", x);
    printf("<%020.3f>\n", x);
    printf("<%f>\n", y);
    printf("<%.9f>\n", y);
    printf("<%.20f>\n", y);
    printf("<%20.4e>\n", y);
}                                      
