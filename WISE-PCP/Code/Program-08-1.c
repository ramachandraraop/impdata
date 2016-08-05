#include <stdio.h>
int sum(int, int);
int display();

int sum(int x, int y) {
    int add = x + y;
    return add;
}

int display() {
    int result = sum(10, 20);
    return result;
}

int main() {
    int total = display();
    printf("sum of two numbers is %d\n", total);
    return 0;
}
