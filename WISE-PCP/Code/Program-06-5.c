#include <stdio.h>
int main() {
    int T1_marks;
    int T2_marks;
    printf("Enter Two Test Marks : ");
    scanf("%d %d", &T1_marks, &T2_marks);
    if (T1_marks < 50 || T2_marks < 50)
        printf("Not Qualified \n");
    else
        printf("Qualified \n");
    return 0;
}
