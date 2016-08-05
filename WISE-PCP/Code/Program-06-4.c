#include <stdio.h>
int main() {
    int T1_marks, T2_marks;
    printf("Enter Two Test Marks : ");
    scanf("%d %d", &T1_marks, &T2_marks);
    if (T1_marks > 50 && T2_marks > 50)
        printf("Qualified \n");
    else
        printf("Not Qualified \n");
    return 0;
}
