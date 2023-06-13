# 나이순 정렬

import sys

n=int(input())
member=[]

for i in range(n):
    age, name = sys.stdin.readline().split()
    age=int(age)
    member.append([age, name])

member.sort(key = lambda x : x[0]) # [age, name]에서 age만 비교, 나머지 안정정렬

for j in range(n):
    print(member[j][0], member[j][1])
