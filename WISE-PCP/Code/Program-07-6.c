#include <stdio.h>
int main() {
    int start_val;
    int end_val;
    int sum_odd = 0;
    printf("Enter the Start and End values : ");
    scanf("%d %d", &start_val, &end_val);
    for (int num = start_val; num <= end_val; num++) {
        if (num % 2 == 0) {
            continue;
        }
        sum_odd += num;
    }
    printf("Sum Of Odd Numbers between %d and %d is %d\n",
                              start_val, end_val, sum_odd);
    return 0;
}
