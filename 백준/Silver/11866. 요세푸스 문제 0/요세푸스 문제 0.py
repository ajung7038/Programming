'''
from collections import deque

que=deque()
answer=[]

N, K = map(int, input().split())

# 1~N까지의 숫자 추가
for i in range(1, N+1):
    que.append(i)
    
while que:
    for i in range(K-1):
        que.append(que.popleft())
    answer.append(que.popleft())
    
print("<", end="")
for i in range(len(answer)-1):
    print("%d" %answer[i], end="")
print(answer[-1], end="")
print(">")
'''


from collections import deque

queue = deque()
answer = []

n, k = map(int, input().split())

for i in range(1, n+1):
    queue.append(i)

while queue:
    for i in range(k-1):
        queue.append(queue.popleft())
    answer.append(queue.popleft())

print("<",end='')
for i in range(len(answer)-1):
    print("%d, "%answer[i], end='')
print(answer[-1], end='')
print(">")
