N=int(input())
for i in range(N):
    s=[]
    total=""
    s=input().strip()
    repeat=int(s[0])
    string=s[2:]
    for j in string:
        total+=j*repeat
    print(total)
