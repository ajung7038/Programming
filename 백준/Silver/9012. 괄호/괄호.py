N=int(input())

for i in range(N):
    string=input().strip()
    lst=[]
    for j in string:
        if not lst:
            lst.append(j)
        elif lst[0]==")":
            break
        elif j==lst[-1]:
            lst.append(j)
        else: # j!=lst[-1]
            lst.pop() #()쌍 제거
    if not lst:
        print("YES")
    else:
        print("NO")
