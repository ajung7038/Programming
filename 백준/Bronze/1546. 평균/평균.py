n=int(input())

num=input().split()
total=0

for j in range (n):
    num[j]=int(num[j])

for i in num:
    large=int(max(num))
    total+=(int(i)/large)*100

print(total/n)

