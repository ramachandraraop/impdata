#include <stdio.h>
int main() {
    int avg;
    printf("Enter The Average Percentage : ");
    scanf("%d", &avg);
    if (avg >= 60)
        printf("Passed in First Division\n");
    else if (avg >= 50)
        printf("Passed in Second Division\n");
    else if (avg >= 40)
        printf("Passed in Third Division \n");
    else
        printf("Failed");
    return 0;
}
