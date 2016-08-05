#include <stdio.h>
int main() {
    int start_val;
    int end_val;
    printf("Enter the Start and End value : ");
    scanf("%d %d", &start_val, &end_val);
    while (start_val <= end_val) {
        printf("%4d", start_val);
        if (start_val % 10 == 0) {
            break;
        }
        start_val++;
    }
    printf("\n");
    return 0;
}
