# Print all palindrome numbers with in the given range

def reverse(num):
    rev = 0
    while num > 0:
        r = num % 10
        rev = (rev * 10) + r
        num //= 10
    return rev

def isPalindrome(num):
    return reverse(num) == num

st_val = int(input("Enter The Start Value: "))
end_val = int(input("Enter The End value: "))

for n in range(st_val, end_val + 1):
    if isPalindrome(n):
        print(n)
