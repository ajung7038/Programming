def func(n):
    if n==0:
        return 0
    elif n==1:
        return 1
    elif n==2:
        return 1
    elif n>2:
        return (func(n-2)+func(n-1))

n=int(input())
print(func(n))
