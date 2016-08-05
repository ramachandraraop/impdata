#include <stdio.h>
#include <stdbool.h>

bool isPrime(int);
int PrimesInRange(int, int);

int main() {
    int start;
    int end;
    printf("Enter start of range: ");
    scanf("%d", &start);
    printf("Enter end  of range: ");
    scanf("%d", &end);
    int n = PrimesInRange(start, end);
    printf("\nThats %d primes between %d and %d\n", n, start, end);
    return 0;
}

int PrimesInRange(int a, int b) {
    int primeCount = 0;
    for (int n = a; n <= b; n++) {
        if (isPrime(n)) {
            primeCount++;
            printf("%6d", n);
        }
    }
    return primeCount;
}

bool isPrime(int n) {
    for (int i = 2; i < n; i++) {
        if (n % i == 0) {
            return false;
        }
    }
    return true;
}
