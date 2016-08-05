def isOdd(n):
    return n % 2 != 0

def isPrime(num): 
    if num == 2:
        return True
    if not isOdd(num):
        return False
    limit = num // 2  + 1
    for div in range(3, limit, 2):
        if num % div == 0:
            return False
    return True

def generatePrimes():
    for num in range(100, 1000):
        if isPrime(num):
            yield num

def isAllOddDigits(num):
    while num > 0:
        digit = num % 10
        if not isOdd(digit):
            return False
        num //= 10
    return True

for num in generatePrimes():
    if isAllOddDigits(num):
        print(num)
