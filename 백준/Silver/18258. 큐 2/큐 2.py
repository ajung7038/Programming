# pop => 요소들의 인덱스를 한 칸씩 당기는 과정에서 O(n)의 계산량 발생
# deque 활용
import sys
from collections import deque

cmd_num=int(input()) # 명령의 수
que=deque([])

for i in range(cmd_num):
    cmd=sys.stdin.readline().split()

    if cmd[0]=="push":
        que.append(cmd[1])
    elif cmd[0]=="pop":
        if not que:
            print(-1)
        else:
            print(que.popleft())
    elif cmd[0]=="size":
        print(len(que))
    elif cmd[0]=="empty":
        if not que:
            print(1)
        else:
            print(0)
    elif cmd[0]=="front":
        if not que:
            print(-1)
        else:
            print(que[0])
    elif cmd[0]=="back":
        if not que:
            print(-1)
        else:
            print(que[-1])
