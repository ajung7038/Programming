import sys
dic={} # 중복이 되지 않는다는 성질 이용

for i in range (10):
    num=int(sys.stdin.readline())
    dic[num%42]=i
print(len(dic))