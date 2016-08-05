def isPerfectSquare(n):
    '''This function returns
         a number and a boolen value'''
    f = 1
    while f * f < n:
        f += 1
    return f, f * f == n 

def generatePerfectSquares(LO, HI):
    for num in range(LO, HI):
        val, status = isPerfectSquare(num)
        if status:
            print("{0:8}".format(num))


generatePerfectSquares(10, 100)


