#include <stdio.h>
int fibo(int);
int main() {
    int num;
    int result;
    printf("Which fibonacci number is wanted? ");
    scanf("%d", &num);
    if (num > 0) {
        result = fibo(num);
        printf("The %d number in fibonacci series is %d\n", num, result);
    }
    return 0;
}

int fibo(int num) {
    if (num <= 1) {
        return 1;
    } else {
        return(fibo(num - 1) + fibo(num - 2));
    }
}
