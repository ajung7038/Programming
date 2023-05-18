N, X=map(int, input().split())
A=[]

A += map(int, input().split())

for repeat in A:
    if repeat<X:
        print(repeat, end=" ")