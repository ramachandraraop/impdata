#include <stdio.h>
int main() {
    int marks[10];
    int n;
    int sum = 0;
    printf("Enter number of students : ");
    scanf("%d", &n);
    for (int i = 0; i < n; ++i) {
        printf("Enter marks of student %d: ", i+1);
        scanf("%d", &marks[i]);
        sum += marks[i];
    }
    printf("Sum = %d\n", sum);
    return 0;
}
