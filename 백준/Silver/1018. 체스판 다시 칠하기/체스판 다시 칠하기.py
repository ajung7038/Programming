''' => 풀이 실패 : 코드 참조
1. 8*8 체스판 고정
2. N-7, M-7만큼 8*8 체스판 반복
'''

# 입력 -> N:세로, M:가로
N, M=map(int, input().split()) # strip()=> ValueError 발생
board=[]
result=[]
for color in range(N):
    board.append(input())
    
# 계산
for i in range(N-7): # 세로
    for j in range(M-7): # 가로
        count1=0
        count2=0
        # 8*8 체스판 고정
        for k in range(i, i+8):
            for m in range(j, j+8):
                if (k+m) % 2 == 0:
                    if board[k][m] != "B":
                        count1 +=1
                    if board[k][m] != "W":
                        count2 +=1
                else:
                    if board[k][m] !="W":
                        count1 += 1
                    if board[k][m] !="B":
                        count2 += 1
        # 경우의 수 계산                
        result.append(count1)
        result.append(count2)
        
# min 값 출력
print(min(result))