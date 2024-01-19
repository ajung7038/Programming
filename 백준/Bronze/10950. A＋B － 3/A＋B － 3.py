TryNum=int(input())
save=[]

for repeat in range(TryNum):
    A, B=input().split()
    A=int(A)
    B=int(B)
    save.append(A+B)
for i in save:
    print(i)