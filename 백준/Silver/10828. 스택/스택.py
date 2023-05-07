def push(num):
    stack.append(num)
    
def pop():
    if not stack:
        print(-1)
    else:
        a=stack.pop()
        print(a)
        
def size():
    print(len(stack))
    
def empty():
    if not stack:
        print(1)
    else:
        print(0)
        
def top():
    if not stack:
        print(-1)
    else:
        print(stack[-1])
    
    
 # 입력
import sys
N=int(sys.stdin.readline())
stack=[]

for repeat in range(N):
    command="" # command 초기화
    command=sys.stdin.readline().strip().split()
    if command[0]=="push":
        push(command[1]) # push 값 전달
    elif command[0]=="pop":
        pop()
    elif command[0]=="size":
        size()
    elif command[0]=="empty":
        empty()
    elif command[0]=="top":
        top()
