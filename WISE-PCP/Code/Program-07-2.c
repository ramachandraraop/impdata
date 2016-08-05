#include <stdio.h>
int main() {
    int start_val;
    int end_val;

    printf("Enter The Range (Start and End Values):");
    scanf("%d %d", &start_val, &end_val); 
    printf("The Even Numbers between %d and %d are:\n",
                            start_val, end_val); 
    while (start_val <= end_val) {
        if (start_val % 2 == 0) 
            printf("%4d", start_val);
        start_val++;
    }
    printf("\n");
    return 0;
}
