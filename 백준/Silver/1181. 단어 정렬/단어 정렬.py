# 단어 정렬

n=int(input())
lst=[]

for i in range(n):
    word=input()
    lst.append((len(word), word))


lst=list(set(lst))
lst.sort()

for j in lst:
    print(j[1])
