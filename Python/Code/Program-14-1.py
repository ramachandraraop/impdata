for n in range(1, 11): # Iterates value from 1 to 10
    print(n)

str1 = "Talent"
for ch in str1: # Iterates char by char from string str1
    print(ch)

even_nums = [x for x in range(1,21) if x % 2 == 0] 
# stores all even numbers between 1 to 20 in list 'even_nums'
for num in even_nums: # Iterates each element from list 'even_nums'
    print(num)
