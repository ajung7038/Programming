def fact(num):
    if num==0:
        return 1
    else:
        return fact(num-1)*num
    
# 실행
N=int(input())
print(fact(N))
