
# function to get the reverse of the given number

def reverse(num):
    rev_num = 0
    while (num > 0):
        rem = num % 10
        rev_num = (rev_num * 10) + rem
        num //= 10
    return rev_num

# function to check the number is palindrome
def isPalindrome(num):
    return (reverse(num) == num)


# function to check all digits are even 
def allEvenDigits(num):
    while (num > 0):
        rem = num % 10
        if (rem % 2 != 0):
            return False
        num //= 10
    return True

def allPalindromes(n1, n2):
    for num in range(n1, n2 + 1):
        if (isPalindrome(num) and allEvenDigits(num)):
            print(num)

# function call
allPalindromes(100,999)
