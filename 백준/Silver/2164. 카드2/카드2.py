import sys
from collections import deque
num=int(sys.stdin.readline())
que=deque([])

for i in range(num): #1~num까지의 원소 추가
    que.append(i+1)
    
for j in range(num-1):
    if len(que)==2:
        que.popleft()
        break
    else:
        que.popleft()
        que.rotate(-1)
print(que[0])
