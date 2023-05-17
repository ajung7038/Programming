import sys
from collections import deque

N=int(sys.stdin.readline())
queue=deque()

for repeat in range (N):
    cmd=sys.stdin.readline().split()
    if cmd[0]=="push_front":
        queue.appendleft(cmd[1])
        #queue.rotate(1)
    elif cmd[0]=="push_back":
        queue.append(cmd[1])
    elif cmd[0]=="pop_front":
        if not queue:
            print(-1)
        else:
            print(queue.popleft())
    elif cmd[0]=="pop_back":
        if not queue:
            print(-1)
        else:
            print(queue.pop())
    elif cmd[0]=="size":
        print(len(queue))
    elif cmd[0]=="empty":
        if not queue:
            print(1)
        else:
            print(0)
    elif cmd[0]=="front":
        if not queue:
            print(-1)
        else:
            print(queue[0])
    elif cmd[0]=="back":
        if not queue:
            print(-1)
        else:
            print(queue[-1])