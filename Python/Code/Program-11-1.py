def isEven(num):
    return (num % 2 == 0)

def sumOfEvenNumbers(st_val, limit):
    sumEvenNums = 0
    for num in range(st_val, limit + 1):
        if (isEven(num)):
            sumEvenNums += num
    return sumEvenNums

print(sumOfEvenNumbers(100,999))
