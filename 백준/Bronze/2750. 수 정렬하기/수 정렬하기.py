# 버블 정렬 구현


n=int(input())
num=[]

for i in range(n):
    num.append(int(input()))

for k in range(n):
    for j in range(n):
        if num[k] < num[j]:
            num[k], num[j] = num[j], num[k]

for m in num:
    print(m)
