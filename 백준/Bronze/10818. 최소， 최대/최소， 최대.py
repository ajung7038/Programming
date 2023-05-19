N=int(input())
lst=[]
lst += map(int, input().split())
lst.sort() #시간복잡도 : NlogN

# 최솟값&최댓값 출력
print(lst[0], end=" ")
print(lst[-1])