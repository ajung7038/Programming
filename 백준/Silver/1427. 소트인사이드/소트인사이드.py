n=input()
a=[]

for i in n:
    a.append(i)

a.sort(reverse=True)

for j in a:
    print(j, end="")
