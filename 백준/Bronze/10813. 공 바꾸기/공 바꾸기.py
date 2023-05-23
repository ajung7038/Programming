N, M=map(int, input().split())
lst=[]

for i in range (1, N+1):
    lst.append(i)
    
for repeat in range(M):
    i, j = map(int, input().split())
    lst[i-1], lst[j-1] = lst[j-1], lst[i-1]

for j in lst:
    print(j, end=" ")