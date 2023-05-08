K=int(input())
stack=[]

for repeat in range(K):
    num=int(input())
    if num!=0:
        stack.append(num)
    else:
        stack.pop()
        
print(sum(stack))