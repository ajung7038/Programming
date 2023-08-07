a, b = map(int, input().split())
c=int(input())
minute=b+c
while True:
    if minute<60:
        break
    elif a==23 and minute>=60:
        a=0
        minute-=60
    elif minute>=60:
        a+=1
        minute-=60
print(a, minute)