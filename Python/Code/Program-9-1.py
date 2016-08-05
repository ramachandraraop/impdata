# Print all even numbers in a given range

num = int(input("Enter The Start Value: "))
limit = int(input("Enter The Limit: "))

for n in range(num, limit + 1):
    if n % 2 == 0:
        print(n)

