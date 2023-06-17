# 킹, 퀸, 룩, 비숏, 나이트, 폰

lst_versus = [1, 1, 2, 2, 2, 8]
num=list(map(int, input().split()))

for i in range(len(num)):
    print(lst_versus[i]-num[i], end=" ")
